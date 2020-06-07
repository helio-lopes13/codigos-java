package listadupla;

public class TesteListaDupla {

	public static void main(String[] args) {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserirPosicao(10, 1);
		lista.imprimirLista();
		lista.inserirPosicao(10, 0);
		lista.imprimirLista();
		lista.inserirPosicao(8, 1);
		lista.imprimirLista();
		lista.inserirPosicao(4, 2);
		lista.imprimirLista();
		lista.inserirPosicao(6, 2);
		lista.imprimirLista();
		lista.inserirPosicao(2, 4);
		
		lista.imprimirLista();
		lista.removerPosicao(4);
		lista.imprimirLista();
		lista.removerPosicao(2);
		lista.imprimirLista();
		lista.removerPosicao(1);
		lista.imprimirLista();
		lista.removerPosicao(1);
		lista.imprimirLista();
		lista.removerPosicao(1);
		lista.imprimirLista();
		lista.removerPosicao(0);
		lista.imprimirLista();
	}

}
