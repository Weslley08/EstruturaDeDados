package pilha;

import java.util.ListIterator;
import java.util.Stack;

public class PrintStack {

	static void printStack(Stack<Integer> x) {
		ListIterator<Integer> list_It = x.listIterator();

		while (list_It.hasNext())
			list_It.next();
		while (list_It.hasPrevious())
			System.out.println(list_It.previous() + " ");
	}
}
