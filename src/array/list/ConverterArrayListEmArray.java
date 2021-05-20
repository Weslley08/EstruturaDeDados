package array.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverterArrayListEmArray {

	public static void main(String[] args) {
		String[] lista_linguagens = new String[] {"Python", "Java", "PHP", "Ruby"}; 
		ArrayList<String> array_list = new ArrayList<String>(Arrays.asList(lista_linguagens));
		
		System.out.print(array_list);
		
	}

}
