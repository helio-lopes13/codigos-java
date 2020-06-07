package listaencadeada;

public class TesteListaLink {

	public static void main(String[] args) {
		ListaLink lista = new ListaLinkImplem();

		lista.inserePosicao(3, 0);
		lista.imprimeLista();
		lista.inserePosicao(4, 1);
		lista.imprimeLista();
		lista.inserePosicao(3, 2);
		lista.imprimeLista();
		lista.inserePosicao(9, 2);
		lista.imprimeLista();
		lista.inserePosicao(5, 4);
		lista.imprimeLista();
		lista.inserePosicao(6, 5);
		lista.imprimeLista();
		lista.removePosicao(5);
		lista.imprimeLista();
		lista.removePosicao(4);
		lista.imprimeLista();
		lista.removePosicao(2);
		lista.imprimeLista();
		lista.removePosicao(2);
		lista.imprimeLista();
		lista.removePosicao(0);
		lista.imprimeLista();
		lista.removePosicao(1);
		lista.imprimeLista();
	}

}
