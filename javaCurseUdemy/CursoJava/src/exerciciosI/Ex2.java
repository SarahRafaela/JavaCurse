package exerciciosI;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {

		String temperatura = JOptionPane.showInputDialog("Qual a temperatura em F° na sua cidade ?");

		Double f = Double.parseDouble(temperatura);

		Double c;

		c = ((f - 32) * 5 / 9);
		System.out.println("A temperatura em Celsius é:" + c);
		//F = (9*C+160) /5.

	}
}
