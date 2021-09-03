package lista.encadeada;

import java.util.LinkedList;

public class testeAddFirst {

	public static void main(String[] args) {

		// Criando lista vazia
		LinkedList<String> link_list = new LinkedList<>();

		// Metodo add para adicionar elementos na lista
		link_list.add("Weslley Jonathan");
		link_list.add("é");
		link_list.add("Cezario");
		link_list.add("100");
		link_list.add("25");

		// Produzir lista atual
		System.out.println("Nossa lista é: " + link_list);

		// Adicionando elementos no inicio
		link_list.addFirst("Primeiro");
		link_list.addFirst("No");

		// Update List
		System.out.print("Updated List: " + link_list);
	}

}
