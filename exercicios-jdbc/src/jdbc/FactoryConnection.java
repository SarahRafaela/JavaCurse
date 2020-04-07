package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {

	public static Connection getConexao() {
		try {
			String url = "jdbc:mysql://localhost:3306/wm?useTimezone=true&serverTimezone=UTC";
			String user = "root";
			String senha = "123456";

			return DriverManager.getConnection(url, user, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
