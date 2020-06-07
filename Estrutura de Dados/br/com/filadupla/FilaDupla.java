package filadupla;

import listadupla.NoDuplo;

public class FilaDupla<E> implements IFilaDupla<E> {
	private NoDuplo<E> header, trailer;
	private int tamanho;

	public FilaDupla() {
		header = new NoDuplo<E>(null, null, null);
		trailer = new NoDuplo<E>(null, header, null);
		header.setProximo(trailer);
		tamanho = 0;
	}

	@Override
	public void inserirElemento(E valor) {
		NoDuplo<E> novoNo = new NoDuplo<E>(valor);

		trailer.getAnterior().setProximo(novoNo);
		novoNo.setAnterior(trailer.getAnterior());

		novoNo.setProximo(trailer);
		trailer.setAnterior(novoNo);

		tamanho++;
	}

	@Override
	public void removerElemento() {
		if (filaVazia()) {
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
	public void imprimirFila() {
		if (filaVazia()) {
			System.out.println("A fila nao tem nenhum elemento. Nada a imprimir.");
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
	public boolean filaVazia() {
		return tamanho == 0;
	}

}
