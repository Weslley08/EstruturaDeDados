package estruturaCondicional;

public class Ternario {

	public static void main(String[] args) {
		// Ternario
		int a = 30, b = 10, c = 50, resultado;
		resultado = ((a > b) ? (a > c) ? a : c

				: (b > c) ? b : c);
		System.out.println("Máximo de três números " + resultado);
	}
}
