package lista;

public class TeteLista {

	public static void main(String[] args) {
		Lista lista = new ListaImplem(5);
		
		lista.inserirIndice(10, 0);
		lista.imprimirLista();
		
		lista.inserirIndice(12, 1);
		lista.imprimirLista();
		
		lista.inserirIndice(14, 3);
		lista.imprimirLista();
		
		lista.removerIndice(2);
		lista.imprimirLista();
	}

}
