package Exercicios;

public class Ex6 {
	public static void main(String[] args) {
		Double a = 1.0, b = 12.0, c = -13.0;
		// Equação do segundo grau
		Double d = (Math.pow(b, 2) - (4 * a * c));
		Double x1 = (-b) + Math.sqrt(d) / 2 * a;
		Double x2 = (-b) + Math.sqrt(d) / 2 * a;

		System.out.println("Resultado da equação: " + x1 + " e " + x2);
		

	}
}
