package stack.pilha;

/*
isEmpty: Retorna verdadeiro se a pilha estiver vazia, 
senão falso.
 */

public class PilhaIsEmpty {
	
	// Implementando a classe Pilha isEmpty.
	static final int MAX = 1000;
	int top;
	int Pilha[] = new int[MAX];
	
	boolean isEmpty() {
		return (top < 0);	
	}
	
	void Stack() {
		top = -1;
	}

}
