package estruturaCondicional;

public class IF {

	public static void main(String[] args) {

		final boolean condicao = true;

		if (condicao) {
			System.out.println("A condi��o � verdadeira");
		} else {
			System.out.println("A condi��o � falsa");
		}

		final String ternario = condicao ? "� verdadeira" : "� falsa";

		if (condicao) {
			System.out.println("Uma �nica linha...");

		}

		System.out.println(ternario);

	}
}
