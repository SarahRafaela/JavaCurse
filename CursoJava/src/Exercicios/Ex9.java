package Exercicios;

public class Ex9 {
	public static void main(String[] args) {
		Double n1 = 10.0, n2 = 9.0, mediaFinal = 0.0;

		mediaFinal = (n1 + n2) / 2;
		if (mediaFinal >= 7) {

			System.out.println("O aluno foi aprovado! Com média igual : " + mediaFinal);

		} else if (mediaFinal < 7 && mediaFinal > 4) {
			System.out.println("O aluno está de recuperação! Com média igual : " + mediaFinal);

		} else {
			System.out.println("O aluno foi reprovado! Com média igual : " + mediaFinal);
		}
	}
}
