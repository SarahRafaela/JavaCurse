package Fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1= -1;
		int num2= +2;
		
		//Incremento
		num1++;// sintaxe sufixada
		System.out.println(num1);
		//Decremento
		--num1; //sintaxe pr�fixada
		System.out.println(num1); 
		// prefixado ocorre antes da compara��o ele decrementa/incrementa
		//sufixo depois de comparar ele decrementa/incrementa
		System.out.println(++num1 == num2--);
		
		// Nega��o !
		System.out.println(!false);
		//Complemento bin�rio ~
		System.out.println(Integer.toBinaryString(50));
		//complemento
		System.out.println(Integer.toBinaryString(~50));
	}
	
}
