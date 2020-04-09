package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		Connection conexao = FactoryConnection.getConexao();
		String sql = "SELECT * FROM pessoa WHERE nome LIKE ? ";

		System.out.println("Insira um nome para pesquisa:");
		String pesquisa = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesquisa + "%");
		
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + "==>" + p.getNome());
		}

		stmt.close();
		conexao.close();
		entrada.close();
	}
}