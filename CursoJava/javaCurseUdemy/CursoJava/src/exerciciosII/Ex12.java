package exerciciosII;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer chance = 5;
		int resposta = 11;

		System.out.println("\n-- Bem vindo ao Jogo de advinha��o! --\n\n");
		System.out.println("\n-- Fa�a sua aposta! Escolha um n�mero entre 10 e 20: --\n\n");

		int numero = scanner.nextInt();

		while (chance != 0) {
			if (numero >= 0 && numero <= 100) {
				switch (numero) {
				case (11):
					System.out.println("Parab�ns a reposta correta � : " + resposta + "!");
					System.out.println("Voc� chegou ao resultado restando " + chance + " tentativas");
					chance = 0;
					break;
				default:
					chance--;
					System.out.println(" Voc� tem um total de  " + chance + "chance(s)!");
					if (numero > resposta) {

						System.out.println("Fa�a sua aposta! Escolha um n�mero menor que : " + numero);
						numero = scanner.nextInt();
					} else {
						System.out.println("Fa�a sua aposta! Escolha um n�mero maior que : " + numero);
						numero = scanner.nextInt();
			
					}

				}

			}
		}
		System.out.println("Fim de jogo! A resposta correta era "+ resposta);
		
		scanner.close();
	}
}
