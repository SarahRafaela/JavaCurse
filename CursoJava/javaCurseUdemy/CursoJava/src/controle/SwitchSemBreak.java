package controle;


public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "roxa"
;
		switch (faixa.toLowerCase()) {// lowercase para deixar tudo min�sculo
		case "preta":
			System.out.println("Sei fazer o 'Bassai-Dai/ Jion/ Kanku-Dai'");
		case "marrom":
			System.out.println("Sei fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Sei fazer o 'Heian Godan'");
		case "verde":
			System.out.println("Sei fazer o 'Heian Yodan'");
		case "laranja":
			System.out.println("Sei fazer o 'Heian Sadan'");
		case "vermelha":
			System.out.println("Sei fazer o 'Heian Nidan'");
		case "amarela":
			System.out.println("Sei fazer o 'Heian Shodan'");
		default:
			System.out.println("n�o sei nada");
		
		}
		}

}
