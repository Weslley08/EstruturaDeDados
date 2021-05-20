package linked.list;

import java.util.LinkedList;

public class testeClear {

	public static void main(String[] args) {
		
		//Criando lista vazia
		LinkedList<String> link_list = new LinkedList<>();
		
		//Metodo add para adicionar elementos na lista
		link_list.add("Weslley");		
		link_list.add("Jonathan");
		link_list.add("Cezario");
		
		//Produzir lista atual
		System.out.println("Nossa lista é: " + link_list);
		
		//Apagando lista
		link_list.clear();
		
		//Update List
		System.out.println("Updated List: " + link_list);
		
		//Reutilizando a lista
		link_list.add("Weslley");		
		link_list.add("Jonathan");
		link_list.add("Cezario");
		System.out.println("Updated List 2.0: " + link_list);
	
	
	}

}
