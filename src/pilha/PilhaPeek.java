package pilha;

/*
Peek ou Top: Retorna o elemento do topo da pilha.
 */

public class PilhaPeek {

	// Implementando a classe Pilha Peek.
	int peek(int[] pilha, int top, int MAX) {

		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = pilha[top];
			return x;
		}

	}
}
