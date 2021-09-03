package lista.encadeada;

import java.util.LinkedList;

public class testeAddLast {

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

		// Adicionando elementos no fim
		link_list.addLast("No");
		link_list.addLast("Antes");

		// Update List
		System.out.print("Updated List: " + link_list);
	}

}
