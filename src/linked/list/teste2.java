package linked.list;

import java.util.LinkedList;

public class teste2 {

	public static void main(String[] args) {
		
		LinkedList<String> link_list = new LinkedList<>();
		
		link_list.add("Weslley");		
		link_list.add("Cezario");
		link_list.add(1, "Jonathan");
		
		System.out.println("Initial LinkedList: "+ link_list);
		link_list.set(1, "DCM");
		System.out.print("Updated LinkedList: " + link_list);
	}

}
