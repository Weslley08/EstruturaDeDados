package operadores;

public class Relacionais {

@SuppressWarnings("unused")
public static void main(String[] args) {

    final int numero = 6;

    if (numero > 20) {
      System.out.println("O n�mero � maior que 20");
    }  
    
    else if (numero >= 10) {
      System.out.println("O n�mero � maior ou igual a 10");
    }
    
    else if (numero <= 5) {
      System.out.println("O n�mero � menor ou igual que 5");
    }
    else
      System.out.println("nenhuma da anteriores");
 
  	}
}

