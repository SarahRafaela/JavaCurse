package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/wm?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String senha = "123456";

		Connection conexao = DriverManager.getConnection(url, user, senha);
		System.out.println("Conexão efetuado com sucesso");
		conexao.close();

	}
}
