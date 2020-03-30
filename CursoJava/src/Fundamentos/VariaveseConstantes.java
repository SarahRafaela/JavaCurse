package Fundamentos;

public class VariaveseConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;

		System.out.println("a área do circulo é:" + area + "m2.");
		System.out.printf("a área é %f m2.\n", area);
		System.out.printf("a área é %.2f m2.\n", area);
	}

}
