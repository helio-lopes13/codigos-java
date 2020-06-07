package listadupla;

public class ListaDupla<E> implements IListaDupla<E> {
	private NoDuplo<E> header, trailer;
	private int tamanho;

	public ListaDupla() {
		header = new NoDuplo<E>(null, null, null);
		trailer = new NoDuplo<E>(null, header, null);
		header.setProximo(trailer);
		tamanho = 0;
	}

	@Override
	public void inserirInicio(E valor) {
		NoDuplo<E> novoNo = new NoDuplo<E>(valor);

		header.getProximo().setAnterior(novoNo);
		novoNo.setProximo(header.getProximo());

		novoNo.setAnterior(header);
		header.setProximo(novoNo);

		tamanho++;
	}

	@Override
	public void inserirFim(E valor) {
		NoDuplo<E> novoNo = new NoDuplo<E>(valor);

		trailer.getAnterior().setProximo(novoNo);
		novoNo.setAnterior(trailer.getAnterior());

		novoNo.setProximo(trailer);
		trailer.setAnterior(novoNo);

		tamanho++;
	}

	@Override
	// Intervalo para inserção: pos >= 0 && pos <= tam
	public void inserirPosicao(E valor, int posicao) {
		if (posicao < 0 || posicao > tamanho) {
			System.out.println("Posicao invalida.");
			return;
		}

		if (posicao == 0) {
			inserirInicio(valor);
			return;
		} else if (posicao == tamanho) {
			inserirFim(valor);
			return;
		} else {
			NoDuplo<E> novoNo = new NoDuplo<E>(valor), noParaInsercao = getNoPosicao(posicao);
			
			noParaInsercao.getAnterior().setProximo(novoNo);
			novoNo.setAnterior(noParaInsercao.getAnterior());

			novoNo.setProximo(noParaInsercao);
			noParaInsercao.setAnterior(novoNo);

			tamanho++;
		}
	}

	@Override
	public void removerInicio() {
		if (listaVazia()) {
			System.out.println("Nao ha nada para remocao.");
			return;
		}
		NoDuplo<E> noRemovido = header.getProximo();

		header.setProximo(noRemovido.getProximo());
		noRemovido.getProximo().setAnterior(header);

		noRemovido.setAnterior(null);
		noRemovido.setProximo(null);

		tamanho--;
	}

	@Override
	public void removerFim() {
		if (listaVazia()) {
			System.out.println("Nao ha nada para remocao.");
			return;
		}
		NoDuplo<E> noRemovido = trailer.getAnterior();

		trailer.setAnterior(noRemovido.getAnterior());
		noRemovido.getAnterior().setProximo(trailer);

		noRemovido.setAnterior(null);
		noRemovido.setProximo(null);

		tamanho--;
	}

	// Intervalo para remoção: pos >= 0 && pos < tam
	@Override
	public void removerPosicao(int posicao) {
		if (listaVazia()) {
			System.out.println("Nao ha nada para remocao.");
			return;
		}
		if (posicao < 0 || posicao >= tamanho) {
			System.out.println("Posicao invalida.");
			return;
		}

		if (posicao == 0) {
			removerInicio();
			return;
		} else if (posicao == tamanho - 1) {
			removerFim();
			return;
		} else {
			NoDuplo<E> noRemovido = getNoPosicao(posicao);
			noRemovido.getAnterior().setProximo(noRemovido.getProximo());
			noRemovido.getProximo().setAnterior(noRemovido.getAnterior());

			noRemovido.setAnterior(null);
			noRemovido.setProximo(null);

			tamanho--;
		}
	}

	@Override
	public void imprimirLista() {
		if (listaVazia()) {
			System.out.println("A lista nao tem nenhum elemento. Nada a imprimir.");
			return;
		}
		NoDuplo<E> aux = header.getProximo();

		while (!aux.equals(trailer)) {
			System.out.print(aux.getValor() + "\t");
			aux = aux.getProximo();
		}
		System.out.println();
	}

	@Override
	public boolean listaVazia() {
		return tamanho == 0;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	private NoDuplo<E> getNoPosicao(int pos) {
		NoDuplo<E> noAtual = header.getProximo();
		for (int i = 0; i < pos; i++) {
			noAtual = noAtual.getProximo();
		}
		return noAtual;
	}

	public E getElemento(int pos) {
		NoDuplo<E> noAtual = header.getProximo();
		for (int i = 0; i < pos; i++) {
			noAtual = noAtual.getProximo();
		}
		return noAtual.getValor();
	}

}
