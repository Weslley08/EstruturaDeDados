package estruturaCondicional;

public class Condicional {

	public static void main(String[] args) {
		int x = 10;

		if (x == 10) {
			if (x < 15) {
				System.out.println("X � menor que 15");
			}
			if (x < 12)
				System.out.println("X � menor que 12");
			else
				System.out.println("X � maior que 15");
		}
	}
}