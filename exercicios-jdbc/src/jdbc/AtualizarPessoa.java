package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FactoryConnection.getConexao();
		String sql = "SELECT codigo, nome FROM pessoa where codigo = ?";

		System.out.println("Insira o código do usuário para er alterado:");
		int codigoAlter = entrada.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigoAlter);

		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é " + p.getNome());
			System.out.println("Informe o novo nome: ");
			entrada.nextLine();
			String novoNome = entrada.nextLine();

			sql = "UPDATE pessoa SET nome = ? WHERE codigo =  ? ";
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigoAlter);
			stmt.execute();
			System.out.println("Pessoal aterada com sucesso");
		} else {
			System.out.println("Pessoa não encontrada");
		}

		stmt.close();
		conexao.close();
		entrada.close();
	}
}
