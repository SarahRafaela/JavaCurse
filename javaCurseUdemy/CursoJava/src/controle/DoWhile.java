package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double somaNotas = 0, nota = 0;
		int numeroNotas = 0;
		do {
			nota = scanner.nextDouble();
			if (nota <= 10 && nota >= 0) {
				somaNotas += nota;
				numeroNotas++;
				
			}
		} while (numeroNotas < 3);
		scanner.close();
		System.out.printf("A média é: %.2f", somaNotas / numeroNotas );

	}

}
