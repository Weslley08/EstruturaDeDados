package listaEncadeada;

import java.util.LinkedList;

public class testeLastIndexOf {

	public static void main(String[] args) {

		// Criando lista vazia
		LinkedList<String> link_list = new LinkedList<>();

		// Metodo add para adicionar elementos na lista
		link_list.add("Weslley");
		link_list.add("Jonathan");
		link_list.add("Cezario");

		// Exibindo lista
		System.out.println("Lista atual: " + link_list);

		// A �ltima posi��o de um elemento � retornada
		System.out.println("A �ltima ocorrencia de Weslley � em index: " + link_list.lastIndexOf("Weslley"));
		System.out.println("A �ltima ocorrencia de Cezario � em index: " + link_list.lastIndexOf("Cezario"));

	}

}
