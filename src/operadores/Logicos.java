package operadores;

public class Logicos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		final int numero = 2;
		final String letra = "A";

		// Sort Circuit
		if (numero < 5 && letra.equals("A")) {
			System.out.println("Atendeu a condi��o");
		}

		if (numero < 5 || letra.equals("A")) {
			System.out.println("Atendeu a outra condi��o");
		}

		if ((10 - 5) > 1 && (5 - 3) > 1) {
			System.out.println("L�gica maluca...");
		}

		// Non Sort Circuit
		/*
		 * if (verifica(15) | verifica("A")) { System.out.println("OK"); } else {
		 * System.out.println("Não OK"); }
		 */

	}

	@SuppressWarnings("unused")
	private static boolean verifica(String letra) {
		System.out.println("Verificando letra...");
		return letra.equals("A");
	}

	@SuppressWarnings("unused")
	private static boolean verifica(Integer numero) {
		System.out.println("verificando numero...");
		return numero > 10;
	}
}
