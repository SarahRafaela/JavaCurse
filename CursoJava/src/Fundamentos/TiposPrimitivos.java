package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);

		// tipo primitivo caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';// P maiusculo tabela unicode
		System.out.printf("%c %c %c\n", c1, c2, c3);

		// tipo primitivo inteiro
		byte b = 127;// vai até 127
		short s = 32_767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;// L(limite) representa um long

		System.out.printf("%d %d %d %d\n", b, s, i, l);
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		// tipo primitivo real
		float f = 3.1416f;// tem que explicitar que é float
		double d = 2.45;// literal é tipo double
		System.out.printf("%f %f\n", f, d);
		System.out.printf("%.3f %.1f\n", f, d);// com casa decimal especificada
	}
}
