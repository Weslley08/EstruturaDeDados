package estruturaCondicional;

public class IF {

	public static void main(String[] args) {

		final boolean condicao = true;

		if (condicao) {
			System.out.println("A condição é verdadeira");
		} else {
			System.out.println("A condição é falsa");
		}

		final String ternario = condicao ? "É verdadeira" : "É falsa";

		if (condicao) {
			System.out.println("Uma Única linha...");

		}

		System.out.println(ternario);

	}
}
