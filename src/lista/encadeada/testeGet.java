package lista.encadeada;

import java.util.LinkedList;

public class testeGet {

	public static void main(String[] args) {

		LinkedList<String> link_list = new LinkedList<>();

		link_list.add("Geeks");
		link_list.add("Geeks");
		link_list.add(1, "For");

		// Usando o metodo get no la�o for
		for (int i = 0; i < link_list.size(); i++) {
			System.out.println(link_list.get(i) + " ");
		}

		System.out.println();

		// Usando o la�o for each
		for (String str : link_list) {
			System.out.print(str + " ");
		}
	}
}