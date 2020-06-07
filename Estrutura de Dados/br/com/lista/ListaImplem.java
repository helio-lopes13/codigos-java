package lista;

public class ListaImplem implements Lista {

	private Integer[] lista;
	private int posicao = -1;

	public ListaImplem(int tamanho) {
		lista = new Integer[tamanho];
	}

	@Override
	public void inserirInicio(Integer valor) {
		if (listaCheia()) {
			System.out.println("Lista cheia. Elemento nao inserido.");
			return;
		}

		for (int i = ++posicao; i > 0; i--) {
			lista[i] = lista[i - 1];
		}
		lista[0] = valor;
	}

	@Override
	public Integer removerInicio() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha elementos para remocao.");
			return null;
		}

		Integer elementoRemovido = lista[0];
		for (int i = 0; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}
		lista[posicao--] = null;
		return elementoRemovido;
	}

	@Override
	public void inserirFinal(Integer valor) {
		if (listaCheia()) {
			System.out.println("Lista cheia. Elemento nao inserido");
			return;
		}
		lista[++posicao] = valor;
	}

	@Override
	public Integer removerFinal() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha elementos para remocao.");
			return null;
		}

		Integer elementoRemovido = lista[posicao];
		lista[posicao--] = null;
		return elementoRemovido;
	}

	@Override
	public void inserirIndice(Integer valor, int indice) {
		if (listaCheia()) {
			System.out.println("Lista cheia. Elemento nao inserido.");
			return;
		}

		// Intervalo para insercao: indice >= 0 && indice <= posicao + 1
		if (indice < 0 || indice > posicao + 1) {
			System.out.println("Indice invalido. Elemento nao inserido.");
			return;
		}

		for (int i = ++posicao; i > indice; i--) {
			lista[i] = lista[i - 1];
		}
		lista[indice] = valor;
	}

	@Override
	public Integer removerIndice(int indice) {
		if (listaVazia()) {
			System.out.println("Lista vazia. Nao ha elementos para remocao.");
			return null;
		}

		// Intervalo para remocao: indice >= 0 && indice <= posicao
		if (indice < 0 || indice > posicao) {
			System.out.println("Indice invalido. Elemento nao inserido.");
			return null;
		}

		Integer elementoRemovido = lista[indice];
		for (int i = indice; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}
		lista[posicao--] = null;
		return elementoRemovido;
	}

	@Override
	public boolean listaCheia() {
		return lista.length == posicao + 1;
	}

	@Override
	public boolean listaVazia() {
		return posicao == -1;
	}

	@Override
	public void imprimirLista() {
		if (listaVazia()) {
			System.out.println("Lista vazia. Não ha o que imprimir.");
		} else {
			for (int i = 0; i <= posicao; i++) {
				System.out.print(lista[i] + "\t");
			}
			System.out.println();
		}
	}

}
