package br.com.prova;

public class ListaEncadeada implements ILista {

	private Node inicio;
	private int tamanho;

	@Override
	public void insereInicio(Integer valor) {
		Node novoNode = new Node(valor, null);
		if (listaVazia()) {
			inicio = novoNode;
		} else {
			novoNode.setProximo(inicio);
			inicio = novoNode;
		}
		tamanho++;
	}

	@Override
	public void inserePosicao(int pos, Integer valor) {
		Node novoNode = new Node(valor, null);
		if (pos < 0 || pos > tamanho) {
			System.out.println("Indice invalido. Elemento nao inserido.");
		} else {
			if (pos == 0) {
				insereInicio(novoNode.getValor());
			} else if (pos == tamanho) {
				insereFinal(novoNode.getValor());
			} else {
				Node aux = inicio;
				int cont = 0;
				while (cont < pos - 1) {
					aux = aux.getProximo();
					cont++;
				}
				novoNode.setProximo(aux.getProximo());
				aux.setProximo(novoNode);
				tamanho++;
			}
		}
	}

	@Override
	public void insereFinal(Integer valor) {
		Node novoNode = new Node(valor, null);
		if (listaVazia()) {
			inicio = novoNode;
		} else {
			Node aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoNode);
		}
		tamanho++;
	}

	@Override
	public void removeInicio() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que remover.");
		} else {
			Node nodeRemovido = inicio;
			System.out.println("Elemento removido: " + nodeRemovido.getValor());
			inicio = inicio.getProximo();
			nodeRemovido.setProximo(null);
			tamanho--;
		}
	}

	@Override
	public void removePosicao(int pos) {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que remover.");
		} else if (pos < 0 || pos > tamanho - 1) {
			System.out.println("Indice invalido. Elemento nao inserido.");
		} else {
			if (pos == 0) {
				removeInicio();
			} else if (pos == tamanho - 1) {
				removeFinal();
			} else {
				Node aux = inicio;
				int cont = 0;
				while (cont < pos - 1) {
					aux = aux.getProximo();
					cont++;
				}
				Node nodeRemovido = aux.getProximo();
				System.out.println("Elemento removido: " + nodeRemovido.getValor());
				aux.setProximo(nodeRemovido.getProximo());
				nodeRemovido.setProximo(null);
			}
		}
	}

	@Override
	public void removeFinal() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha o que remover.");
		} else if (inicio.getProximo() != null) {
			Node aux = inicio, nodeRemovido = inicio;
			while (nodeRemovido.getProximo() != null) {
				nodeRemovido = nodeRemovido.getProximo();
			}
			while (aux.getProximo() != nodeRemovido) {
				aux = aux.getProximo();
			}
			System.out.println("Elemento removido: " + nodeRemovido.getValor());
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
			Node aux = inicio;
			while (aux != null) {
				System.out.print(aux.getValor() + "\t");
				aux = aux.getProximo();
			}
			System.out.println();
		}
	}
	
	public Node getInicio() {
		return inicio;
	}

}
