package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class excluirPessoas {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FactoryConnection.getConexao();
		String sql = "DELETE FROM PESSOA WHERE CODIGO = ?";
		System.out.println("Informe o código para deleção: ");
		int codigo = entrada.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Nenhuma alteração");
		}
		conexao.close();
		entrada.close();

	}
}
