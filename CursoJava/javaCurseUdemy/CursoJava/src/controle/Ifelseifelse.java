package controle;

public class Ifelseifelse {
	public static void main(String[] args) {
		double nota = 9.0;

		if (nota >= 9) {
			System.out.println("Quadro de honra!");
		} else if (nota >= 7) {
			System.out.println("Aprovado!");
		} else if (nota >= 5.5) {
			System.out.println("Recupera��o!");
		} else if (nota >= 3.5) {
			System.out.println("Recupera��o + Trabalho!");
		} else {
			System.out.println("Reprovado!");
		}
	}
}
