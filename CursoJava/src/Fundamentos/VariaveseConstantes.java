package Fundamentos;

public class VariaveseConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;

		System.out.println("a �rea do circulo �:" + area + "m2.");
		System.out.printf("a �rea � %f m2.\n", area);
		System.out.printf("a �rea � %.2f m2.\n", area);
	}

}
