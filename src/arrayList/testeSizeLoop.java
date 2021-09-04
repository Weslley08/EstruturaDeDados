package arrayList;

import java.util.ArrayList;

public class testeSizeLoop {

	public static void main(String[] args) {

		// Criando Array List vazia
		ArrayList<String> lista_carros = new ArrayList<String>();

		// Adicionando elementos a lista
		lista_carros.add("Volvo");
		lista_carros.add("Fiat");
		lista_carros.add("BMW");
		lista_carros.add("Jaguar");
		lista_carros.add("Mercedez");

		// Exibindo lista
		System.out.println(lista_carros);

		// Criando Loop
		for (int i = 0; i <= lista_carros.size(); i++) {
			lista_carros.remove(i);
			System.out.println(lista_carros);
		}
	}

}