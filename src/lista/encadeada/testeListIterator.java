package lista.encadeada;

import java.util.LinkedList;
import java.util.ListIterator;

public class testeListIterator {

	public static void main(String[] args) {

		// Criando lista vazia
		LinkedList<String> link_list = new LinkedList<>();

		// Metodo add para adicionar elementos na lista
		link_list.add("Weslley");
		link_list.add("Jonathan");
		link_list.add("Cezario");

		// Exibindo lista
		System.out.println("Lista atual: " + link_list);

		// Configurando o List Iterator em uma posi��o especificada
		ListIterator<String> list_iterator = link_list.listIterator(2);

		// Itererando atrav�s da lista criada a partir da posi��o
		System.out.println("A lista � a seguinte: ");
		while (list_iterator.hasNext()) {
			System.out.print(list_iterator.next());
		}

	}

}
