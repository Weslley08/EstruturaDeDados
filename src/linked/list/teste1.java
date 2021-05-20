package linked.list;

import java.util.LinkedList;

public class teste1 {

	public static void main(String[] args) {
		
		LinkedList<String> link_list = new LinkedList<>();
		
		link_list.add("Weslley");		
		link_list.add("Cezario");
		link_list.add(1, "Jonathan");
		
		System.out.print(link_list);
	}

}
