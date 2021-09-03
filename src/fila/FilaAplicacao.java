package fila;

public class FilaAplicacao {

	public static void main(String[] args) {
		Fila2 fila = new Fila2();
		
		fila.adicionar(100);
		fila.adicionar(120);
		fila.adicionar(300);
		fila.mostrar();
		fila.remover();
		fila.mostrar();
	}
}