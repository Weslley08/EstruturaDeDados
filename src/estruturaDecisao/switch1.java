package estruturaDecisao;

public class switch1 {
	public static void main(String[] args) {

		int dia = 1;
		System.out.println("Qual n�mero voc� quer saber o correspondente na semana");

		switch (dia) {
		case 1:
			System.out.println("Hoje � Domingo!");
			break;
		case 2:
			System.out.println("Hoje � Segunda-Feira!");
			break;
		case 3:
			System.out.println("Hoje � Ter�a-Feira!");
			break;
		case 4:
			System.out.println("Hoje � Quarta-Feira!");
			break;
		case 5:
			System.out.println("Hoje � Quinta-Feira!");
			break;
		case 6:
			System.out.println("Hoje � Sexta-Feira!");
			break;
		case 7:
			System.out.println("Hoje � S�bado!");
			break;
		}
	}
}
