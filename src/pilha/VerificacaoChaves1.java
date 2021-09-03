package pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class VerificacaoChaves1 {

	public static void main(String[] args) {

		String expressao = "([{}])";

		if (verificacaoChaves(expressao))
			System.out.println("Balanceada ");
		else
			System.out.println("Não balanceada ");

	}

	static boolean verificacaoChaves(String expressao) {

		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < expressao.length(); i++) {
			char x = expressao.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;

			}
		}
		return (expressao.isEmpty());
	}
}
