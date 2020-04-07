package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {
	public static void main(String[] args) throws SQLException {

		Connection conexao = FactoryConnection.getConexao();
		String sql = "";

		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		System.out.println("Tabela cria com sucesso!");
		conexao.close();
	}
}
