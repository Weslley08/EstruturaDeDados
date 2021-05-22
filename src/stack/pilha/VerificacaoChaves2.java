package stack.pilha;

import java.util.Stack;

public class VerificacaoChaves2 {
	
	 static boolean VerificacaoChaves(int x)  {
		Stack<String> stack = new Stack<>();
		
		if (stack.isEmpty()) 
			return false;
		String check;
		switch (x) {
		case ')':
			check = stack.pop();
			if (check == "{" || check == "[") 
				return false;
		break;	
		
		case ']':
			check = stack.pop();
			if (check == "(" || check == "{") 
				return false;
		break;	
		
		case '}':
			check = stack.pop();
			if (check == "(" || check == "[") 
				return false;
		break;	
		
		
		}
		return (stack.isEmpty());
	
	}
}
