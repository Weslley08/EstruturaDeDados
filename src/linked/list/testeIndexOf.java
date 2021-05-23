package linked.list;

import java.util.LinkedList;

public class testeIndexOf {

	public static void main(String[] args) {

		// Criando lista vazia
		LinkedList<String> link_list = new LinkedList<>();

		// Metodo add para adicionar elementos na lista
		link_list.add("Weslley");
		link_list.add("Jonathan");
		link_list.add("Cezario");

		// Exibindo lista
		System.out.println("Lista atual: " + link_list);

		// A primeira posição de um elemento é retornada
		System.out.println("A primeira ocorrencia de Weslley é em index: " + link_list.indexOf("Weslley"));
		System.out.println("A primeira ocorrencia de Cezario é em index: " + link_list.indexOf("Cezario"));

	}

}
