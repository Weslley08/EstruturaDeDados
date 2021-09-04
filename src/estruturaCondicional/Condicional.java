package estruturaCondicional;

public class Condicional {

	public static void main(String[] args) {
		int x = 10;

		if (x == 10) {
			if (x < 15) {
				System.out.println("X é menor que 15");
			}
			if (x < 12)
				System.out.println("X é menor que 12");
			else
				System.out.println("X é maior que 15");
		}
	}
}