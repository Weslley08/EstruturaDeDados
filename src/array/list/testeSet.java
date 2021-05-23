package array.list;

import java.util.ArrayList;

public class testeSet {

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

		// Alterando elemento com o metodo SET
		lista_carros.set(3, "Mercedez");

		// Exibindo lista atualizada
		System.out.println("Lista atualizada: " + lista_carros);
	}

}