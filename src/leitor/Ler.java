package leitor;

import java.util.Scanner;

public class Ler {
	public static void main(String[] args) {
		String nome = "";
		Scanner leitor = new Scanner(System.in);
		System.out.println("Ol� Bem Vindo ao nosso site!");
		System.out.println("Digite seu nome para continuar");
		nome = leitor.nextLine();
		System.out.println("Ol�, "+ nome);
		leitor.close();
	}
}
