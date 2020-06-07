package listaencadeada;

public class ListaLinkImplem implements ListaLink {

	private Link inicio;
	private int tamanho;

	@Override
	public void insereInicio(Integer valor) {
		Link novoLink = new Link(valor, null);
		if (listaVazia()) {
			inicio = novoLink;
		} else {
			novoLink.setProximo(inicio);
			inicio = novoLink;
		}
		tamanho++;
	}

	@Override
	public void inserePosicao(Integer valor, int pos) {
		Link novoNo = new Link(valor, null);
		if (pos < 0 || pos > tamanho) {
			System.out.println("Indice invalido. Elemento nao inserido.");
		} else {
			if (pos == 0) {
				insereInicio(novoNo.getValor());
			} else if (pos == tamanho) {
				insereFinal(novoNo.getValor());
			} else {
				Link aux = getNoPosicao(pos - 1);
				novoNo.setProximo(aux.getProximo());
				aux.setProximo(novoNo);
				tamanho++;
			}
		}
	}

	@Override
	public void insereFinal(Integer valor) {
		Link novoLink = new Link(valor, null);
		if (listaVazia()) {
			inicio = novoLink;
		} else {
			Link aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoLink);
		}
		tamanho++;
	}

	@Override
	public void removeInicio() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que remover.");
		} else {
			Link linkRemovido = inicio;
			System.out.println("Elemento removido: " + linkRemovido.getValor());
			inicio = inicio.getProximo();
			linkRemovido.setProximo(null);
			tamanho--;
		}
	}

	@Override
	public void removePosicao(int pos) {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que remover.");
			return;
		}

		if (pos < 0 || pos >= tamanho) {
			System.out.println("Indice invalido. Elemento nao inserido.");
			return;
		}

		if (pos == 0) {
			removeInicio();
			return;
		} else if (pos == tamanho - 1) {
			removeFinal();
			return;
		} else {
			Link aux = getNoPosicao(pos - 1);
			Link linkRemovido = aux.getProximo();
			System.out.println("Elemento removido: " + linkRemovido.getValor());
			aux.setProximo(linkRemovido.getProximo());
			linkRemovido.setProximo(null);
			tamanho--;
		}
	}

	@Override
	public void removeFinal() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que remover.");
		} else if (inicio.getProximo() != null) {
			Link aux = inicio, linkRemovido = inicio;
			while (linkRemovido.getProximo() != null) {
				linkRemovido = linkRemovido.getProximo();
			}
			while (!aux.getProximo().equals(linkRemovido)) {
				aux = aux.getProximo();
			}
			System.out.println("Elemento removido: " + linkRemovido.getValor());
			aux.setProximo(null);
			tamanho--;
		} else {
			System.out.println("Elemento removido: " + inicio.getValor());
			inicio = null;
			tamanho--;
		}
	}

	@Override
	public boolean listaVazia() {
		return inicio == null;
	}

	@Override
	public void imprimeLista() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que imprimir.");
		} else {
			Link aux = inicio;
			while (aux != null) {
				System.out.print(aux.getValor() + "\t");
				aux = aux.getProximo();
			}
			System.out.println();
		}
	}

	private Link getNoPosicao(int pos) {
		Link linkAtual = inicio;
		for (int i = 0; i < pos; i++) {
			linkAtual = linkAtual.getProximo();
		}
		return linkAtual;
	}

}