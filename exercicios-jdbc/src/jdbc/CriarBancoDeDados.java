package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBancoDeDados {
	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost:3306/wm?useTimezone=true&serverTimezone=UTC";
		final String user = "root";
		final String senha = "123456";

		Connection conexao = DriverManager.getConnection(url, user, senha);
		System.out.println("Conexão efetuado com sucesso");

		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		System.out.println("Banco criado com sucesso ");
		conexao.close();
	}
}
