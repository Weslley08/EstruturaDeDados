package stack.pilha;

import stack.pilha.PilhaLinkedList_1.StackNode;

public class PilhaLinkedList_3 {

	public void push(int date, Object no_principal) {

		StackNode New_no = new StackNode(date);

		if (no_principal == null) {
			no_principal = New_no;
		} else {
			StackNode var_temp = (StackNode) no_principal;
			no_principal = New_no;
			New_no.next = var_temp;
		}
		System.out.println(date + " empilhar stack");
	}

}
