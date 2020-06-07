package filaencadeada;

public class FilaLinkImplem implements FilaLink {

	private Link cabeca;
	private int tamanho = 0;

	@Override
	public void inserirElemento(Integer valor) {
		if (filaVazia()) {
			cabeca = new Link(valor, null);
		} else {
			Link aux = cabeca;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(new Link(valor, null));
		}
		tamanho++;
	}

	@Override
	public Integer removerElemento() {
		if (filaVazia()) {
			System.out.println("Fila vazia. Nao ha elementos para remocao.");
			return null;
		}
		Link linkRemovido = cabeca;

		System.out.println("Elemento removido: " + linkRemovido.getValor());
		cabeca = cabeca.getProximo();
		linkRemovido.setProximo(null);
		tamanho--;

		return linkRemovido.getValor();
	}

	@Override
	public boolean filaVazia() {
		return cabeca == null;
	}

	@Override
	public void imprimirFila() {
		if (filaVazia()) {
			System.out.println("Fila vazia. Nao ha o que imprimir.");
			return;
		}

		Link aux = cabeca;
		while (aux != null) {
			System.out.print(aux.getValor() + "\t");
			aux = aux.getProximo();
		}
		System.out.println();
	}

	public int getTamanho() {
		return tamanho;
	}

}
