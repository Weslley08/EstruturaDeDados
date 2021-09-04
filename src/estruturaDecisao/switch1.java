package estruturaDecisao;

public class switch1 {
	public static void main(String[] args) {

		int dia = 1;
		System.out.println("Qual número você quer saber o correspondente na semana");

		switch (dia) {
		case 1:
			System.out.println("Hoje é Domingo!");
			break;
		case 2:
			System.out.println("Hoje é Segunda-Feira!");
			break;
		case 3:
			System.out.println("Hoje é Terça-Feira!");
			break;
		case 4:
			System.out.println("Hoje é Quarta-Feira!");
			break;
		case 5:
			System.out.println("Hoje é Quinta-Feira!");
			break;
		case 6:
			System.out.println("Hoje é Sexta-Feira!");
			break;
		case 7:
			System.out.println("Hoje é Sábado!");
			break;
		}
	}
}
