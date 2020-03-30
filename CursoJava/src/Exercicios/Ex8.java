package Exercicios;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer anoAtual = 0;

		anoAtual = scanner.nextInt();

		if (anoAtual % 400 == 0 || anoAtual % 4 == 0 && anoAtual % 100 != 0) {
			System.out.println(anoAtual + " é Bissexto!");
		} else {
			System.out.println(anoAtual + " não é Bissexto!");
		}
		scanner.close();

	}

}
