package linked.list;

import java.util.LinkedList;

public class testeContains {

	public static void main(String[] args) {
		
		//Criando lista vazia
		LinkedList<String> link_list = new LinkedList<>();
		
		//Metodo add para adicionar elementos na lista
		link_list.add("Weslley Jonathan");		
		link_list.add("�");
		link_list.add("Cezario");
		link_list.add("100");
		link_list.add("25");
		
		//Produzir lista atual
		System.out.println("Nossa lista �: " + link_list);
		
		//Verificar se determinado objeto est� contido na lista
		System.out.print("A lista cont�m Cezario? " + link_list.contains("Cezario"));
	
	}

}
