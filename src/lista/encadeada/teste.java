package lista.encadeada;

import java.util.LinkedList;

public class teste {

	public static void main(String[] args) {

		LinkedList<String> link_list = new LinkedList<>();

		// Adicionando por indice e objeto
		link_list.add("A");
		link_list.add("B");
		link_list.addLast("C");
		link_list.addFirst("D");
		link_list.add(2, "E");
		System.out.println(link_list);

		// Removendo por indice e objeto
		link_list.remove(3);
		link_list.remove("B");
		link_list.removeFirst();
		link_list.removeLast();
		System.out.print(link_list);

	}

}
