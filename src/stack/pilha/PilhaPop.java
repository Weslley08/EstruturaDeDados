package stack.pilha;

/*
Pop: Remove um item da pilha. 
Os itens s�o exibidos na ordem inversa em que s�o empurrados. 
Se a pilha estiver vazia,
 � considerada uma condi��o de Underflow.
 */


public class PilhaPop {

	//Implementando a classe Pilha Pop.
	int pop(int[] pilha, int top, int MAX) {
		
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
			else {
				int x = pilha[top--];
				return x;
				
		}
	}
}
