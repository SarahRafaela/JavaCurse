package exerciciosII;

public class Ex14 {
	public static void main(String[] args) {
		
		int i = 0;
		String palavra = "Java";
		int qtd = palavra.length();

		for (i = 0; i < qtd; i++) {

			System.out.print(palavra.charAt(i) + " ");
			
		}
		System.out.println("\nPossue " + qtd + " letras.");
	}
}
