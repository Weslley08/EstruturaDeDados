package stack.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceamentoSimbolos {

	static boolean verificacaoChaves(String expressao) {

		// Array deque para usarmos a class stack
		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < expressao.length(); i++) {
			char x = expressao.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
		}
		return false;
	}
}