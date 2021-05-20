package linked.list;

import java.util.LinkedList;

public class testeRemove {

	public static void main(String[] args) {
		
		LinkedList<String> link_list = new LinkedList<>();
		
		link_list.add("Weslley");		
		link_list.add("Cezario");
		link_list.add(1, "Jonathan");
		
		System.out.println("Initial LinkedList: "+ link_list);
		link_list.remove(1);
		System.out.println("Updated LinkedList: " + link_list);
		link_list.remove("Jonathan");
		System.out.print("Updated 2.0 LinkedList: " + link_list);
	}

}
