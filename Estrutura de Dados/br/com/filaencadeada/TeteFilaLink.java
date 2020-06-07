package filaencadeada;

public class TeteFilaLink {

	public static void main(String[] args) {
		FilaLink filaLink = new FilaLinkImplem();
		
		filaLink.removerElemento();
		
		filaLink.inserirElemento(10);
		filaLink.imprimirFila();

		filaLink.inserirElemento(12);
		filaLink.imprimirFila();

		filaLink.inserirElemento(14);
		filaLink.imprimirFila();

		filaLink.removerElemento();
		filaLink.imprimirFila();
	}

}
