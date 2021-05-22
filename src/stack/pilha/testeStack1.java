package stack.pilha;

import java.util.Stack;

public class testeStack1 {

	public static void main(String[] args) {
		
		// Instanciando Stack
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop() + " Stack");
	}

}
