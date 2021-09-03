package pilha;

/*
Push: Adiciona um item à pilha. 
Se a pilha estiver cheia, 
é considerada uma condição de
estouro.
*/

public class PilhaPush {

	// Implementando a classe Pilha Push.
	boolean push(int x, int[] pilha, int top, int MAX) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {

			pilha[top++] = x;
			System.out.println(x + " Push Stack");
			return true;
		}

	}
}
