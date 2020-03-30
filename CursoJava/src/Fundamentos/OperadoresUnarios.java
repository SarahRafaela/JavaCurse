package Fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1= -1;
		int num2= +2;
		
		//Incremento
		num1++;// sintaxe sufixada
		System.out.println(num1);
		//Decremento
		--num1; //sintaxe préfixada
		System.out.println(num1); 
		// prefixado ocorre antes da comparação ele decrementa/incrementa
		//sufixo depois de comparar ele decrementa/incrementa
		System.out.println(++num1 == num2--);
		
		// Negação !
		System.out.println(!false);
		//Complemento binário ~
		System.out.println(Integer.toBinaryString(50));
		//complemento
		System.out.println(Integer.toBinaryString(~50));
	}
	
}
