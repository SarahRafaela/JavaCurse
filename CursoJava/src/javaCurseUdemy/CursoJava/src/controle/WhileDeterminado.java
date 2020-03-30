package controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaNotas = 0;
		double nota = 0;
		int indice = 0;

		while (indice < 3) {
			nota = scanner.nextDouble();
			somaNotas += nota;
			indice++;

		}
		scanner.close();
		System.out.printf("Média: ", somaNotas / 3);
	}
}
