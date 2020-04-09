package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "INSERT INTO pessoa (NOME) VALUES (?)";
		dao.incluir(null, "João Silva");
		dao.incluir(null, "Pedro Antonio");
		dao.incluir(null, "Paula Albuquerque");

		dao.close();
	}
}
