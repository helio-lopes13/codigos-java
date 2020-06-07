package pilhaencadeada;

public class PilhaLinkImplem implements PilhaLink {

	private Link topo;
	private int tamanho;

	@Override
	public void inserirTopo(Integer valor) {
		Link novoLink = new Link(valor, null);
		if (pilhaVazia()) {
			topo = novoLink;
		} else {
			novoLink.setProximo(topo);
			topo = novoLink;
		}
		tamanho++;
	}

	@Override
	public Integer removerTopo() {
		if (pilhaVazia()) {
			System.out.println("Pilha vazia. Nao ha elementos para remover.");
			return null;
		} else {
			Link linkRemovido = topo;
			topo = topo.getProximo();
			linkRemovido.setProximo(null);
			tamanho--;
			return linkRemovido.getValor();
		}
	}

	@Override
	public boolean pilhaVazia() {
		return topo == null;
	}

	@Override
	public void imprimirPilha() {
		if (pilhaVazia()) {
			System.out.println("Pilha vazia. Nao ha elementos para imprimir.");
		} else {
			Link aux = topo;
			while (aux != null) {
				System.out.print(aux.getValor() + "\t");
				aux = aux.getProximo();
			}
			System.out.println();
		}
	}

	public int getTamanho() {
		return tamanho;
	}

}
