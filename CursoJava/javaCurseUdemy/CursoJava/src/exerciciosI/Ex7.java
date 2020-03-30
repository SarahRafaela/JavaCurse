package exerciciosI;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = 0;

		n = scanner.nextInt();

		if (n <= 10 && n >= 0) {
			if (n % 2 == 0) {
				System.out.println(n + " é par!");
			}else {
				System.out.println(n +" é impar!");
			}
			scanner.close();
		}
	}
	
}
