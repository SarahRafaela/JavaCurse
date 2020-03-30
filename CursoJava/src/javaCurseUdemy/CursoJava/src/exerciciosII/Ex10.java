package exerciciosII;

public class Ex10 {
	
public static void main(String[] args) {
		Integer n =5;
		Double  c1 = 0.0, c2 = 0.0;

		while (c1 <= n) {

			if (n % c1 == 0) {
				
				c2++;
			}
			c1++;
		}

		if (c2 <= 2) {
			
			System.out.println( n + " é  primo! ");
		
		} else {
		
			System.out.println(n + " não é primo!");

		}
	}
}



