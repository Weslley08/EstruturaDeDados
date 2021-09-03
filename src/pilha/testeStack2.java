package pilha;

import java.util.ListIterator;
import java.util.Stack;

public class testeStack2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);
		stack.push(-30);

		System.out.println("Stack elementos antes de classificar: ");
		printStack(stack);

		sortStack(stack);

		System.out.println("Elementos após classificação: ");
		printStack(stack);

	}

	private static void sortedInsert(Stack<Integer> s, int x) {
	}

	static void sortStack(Stack<Integer> s) {

		if (!s.isEmpty()) {
			int x = s.pop();
			sortStack(s);
			sortedInsert(s, x);
		}
	}

	private static void printStack(Stack<Integer> x) {
		ListIterator<Integer> list_It = x.listIterator();

		while (list_It.hasNext())
			list_It.next();
		while (list_It.hasPrevious())
			System.out.println(list_It.previous() + " ");
	}

}