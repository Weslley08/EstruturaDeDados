package estrutura.de.controle;

public class While {

	public static void main(String[] args) {

		int x = 0;

		// Testa a condi��o antes
		while (x < 1) {
			System.out.println("Dentro do while...");
			x++;
		}

		int y = 0;

		// Testa a condi��o depois
		do {
			System.out.println("Dentro do do/while...");
		} while (y++ < 1);
	}

}
