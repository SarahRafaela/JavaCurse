package exerciciosII;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer somaP = 0;
		 int n = 0; 

		 
		 while (n >= 0 ) {
			 System.out.println("Escreva um numero:");
			 n = scanner.nextInt();
			 if (n % 2 ==0 && n >= 0) {
				 somaP+= n; 
			 }
			 
		 }
		 System.out.println("A soma dos numeros pares é :"+ somaP );
		 scanner.close();
	}

}
