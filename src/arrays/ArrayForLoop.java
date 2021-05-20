package arrays;

public class ArrayForLoop {

	public static void main(String[] args) {
		
		//Declarando matriz de inteiros
		int[] matriz;
		
		//Instanciando matriz
		matriz = new int[5];
		
		//Adicionando elementos a matriz
		matriz[0] = 10;
		matriz[1] = 20;
		matriz[2] = 30;
		matriz[3] = 40;
		matriz[4] = 50;
		
		//Acessando elementos através do INDEX
		for(int i = 0; i <matriz.length; i++) {
			System.out.println("Meus elementos acessados através do index " + i + ": " + matriz[i]);
		}

	}

}
