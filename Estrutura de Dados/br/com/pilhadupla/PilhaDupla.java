package pilhadupla;

public class PilhaDupla<E> implements IPilhaDupla<E> {
	private int tamanho;
	private NoDuplo<E> header, trailer;

	public PilhaDupla() {
		header = new NoDuplo<E>(null, null, null);
		trailer = new NoDuplo<E>(null, header, null);
		header.setProximo(trailer);
		tamanho = 0;
	}

	@Override
	public void inserirElemento(E valor) {
		NoDuplo<E> novoNo = new NoDuplo<E>(valor);

		header.getProximo().setAnterior(novoNo);
		novoNo.setAnterior(header);

		novoNo.setProximo(header.getProximo());
		header.setProximo(novoNo);

		tamanho++;
	}

	@Override
	public void removerElemento() {
		if (pilhaVazia()) {
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
	public void imprimirPilha() {
		if (pilhaVazia()) {
			System.out.println("A pilha nao tem nenhum elemento. Nao ha nada a imprimir.");
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
	public boolean pilhaVazia() {
		return tamanho == 0;
	}

}
