package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// ler do teclado

		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;

		while (nota != -1) {// -1 para sair do laço
			nota = scanner.nextDouble();// recebe o que vai ser impresso

			if (nota <= 10 && nota >= 0) {// validar notas
				somaDasNotas += nota;// += acrescentando valor de nota a variavel somaDasnotas
				numeroDeNotas++;
			}
		}
		scanner.close();// fechar o scanner porque ele consome recursos
		System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);
	}

}
