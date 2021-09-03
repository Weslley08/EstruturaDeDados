package pilha;

import java.util.Stack;

public class SortStack {

	void sortedInsert(Stack<Integer> s, int x) {
	}

	void sortStack(Stack<Integer> s) {

		if (!s.isEmpty()) {
			int x = s.pop();
			sortStack(s);
			sortedInsert(s, x);
		}
	}

}
