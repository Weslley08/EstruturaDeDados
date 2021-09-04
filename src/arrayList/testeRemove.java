package arrayList;

import java.util.ArrayList;

public class testeRemove {

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

		// Removendo itens da lista
		lista_carros.remove("BMW");
		lista_carros.remove("Jaguar");

		// Exibindo lista atualizada
		System.out.print("Lista atualizada: " + lista_carros);
	}

}