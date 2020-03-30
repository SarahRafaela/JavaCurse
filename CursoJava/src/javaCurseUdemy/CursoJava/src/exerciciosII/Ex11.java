package exerciciosII;

public class Ex11 {
	public static void main(String[] args) {
		Integer n = 5;
		int c2 =0;
		Double c1 = 0.0;

		while (c1 <= n) {

			if (n % c1 == 0) {

				c2++;
			}
			c1++;
		}
		switch (c2) {
		case 1:
		case 2:
			System.out.println(n + " é primo!");
			break;
		default:
			System.out.println(n + " não é primo!");
			break;
		}
	}

}
