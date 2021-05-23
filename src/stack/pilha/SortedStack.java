package stack.pilha;

import java.util.Stack;

public class SortedStack {

	static void sortedInsert(Stack<Integer> a, int x) {
		if (a.isEmpty() || x > a.peek()) {
			a.push(x);
			return;
		}

		int temp = a.pop();
		sortedInsert(a, x);
		a.push(temp);

	}
}
