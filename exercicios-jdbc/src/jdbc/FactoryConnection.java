package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FactoryConnection {

	public static Connection getConexao() {
		try {
			Properties p = getProperties();
			final String url = p.getProperty("banco.url");
			final String user = p.getProperty("banco.user");
			final String senha = p.getProperty("banco.senha");

			// String url =
			// "jdbc:mysql://localhost:3306/curso_java?useTimezone=true&serverTimezone=UTC";
			// String user = "";
			// String senha = "";

			return DriverManager.getConnection(url, user, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}

	}

	private static Properties getProperties() throws IOException {
		Properties p = new Properties();
		String path = "/conexao.properties";
		p.load(FactoryConnection.class.getResourceAsStream(path));
		return p;
	}

}
