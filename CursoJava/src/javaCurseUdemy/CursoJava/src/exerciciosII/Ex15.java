package exerciciosII;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer x = 0, y = 0, aux = 0, cont = 0;

		while (cont < 10) {
			cont++;
			System.out.println("Insira um n�mero:");
			x = scanner.nextInt();
			if (x > y) {
				aux = x;
				x = y;
				y = aux;

			}
		}
		System.out.println(y + " � o maior n�mero!");
		scanner.close();
	}

}
