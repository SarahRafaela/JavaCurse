package Exercicios;

import javax.swing.JOptionPane;

public class Ex1 {
	public static void main(String[] args) {

		String temperatura = JOptionPane.showInputDialog("Qual a temperatura em C° na sua cidade ?");

		Double c = Double.parseDouble(temperatura);

		Double f;

		f = ((9 / 5) * c + 32);
		System.out.println("A temperatura em Fahrenheit é:" + f);
	}
}
