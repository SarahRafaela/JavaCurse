package Fundamentos;

import javax.swing.JOptionPane;

public class Conversaostringnumero {
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2?");

		System.out.println(resposta1 + resposta2);// concaternar

		// Converter string em double
		double nota1 = Double.parseDouble(resposta1);// parseDouble recebe string e converte Resposta
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;

		System.out.println(total / 2);
		// Wrapper
		// Inteiros
		Byte.parseByte("1");
		Short.parseShort("2");
		Integer.parseInt("3");
		Long.parseLong("4");
		// Reais(Pontos Flutuantes)
		Float.parseFloat("1.2");
		Double.parseDouble("2.4");
		// Booleno
		Boolean.valueOf("false");
		// de numero para string
		Integer num1 = 10000;
		System.out.println(num1.toString().length());

		int num2 = 10000;
		System.out.println(Integer.toString(num2));// passagem de parametro
		System.out.println(("" + num2).length());// concartenado com string vazia

	}

}
