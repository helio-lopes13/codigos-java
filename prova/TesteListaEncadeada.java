package br.com.prova;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.insereFinal(3);
		lista.imprimeLista();
		lista.insereFinal(4);
		lista.imprimeLista();
		lista.insereFinal(3);
		lista.imprimeLista();
		lista.insereFinal(3);
		lista.imprimeLista();
		lista.insereFinal(5);
		lista.imprimeLista();
		lista.insereFinal(6);
		lista.imprimeLista();
	}

}
