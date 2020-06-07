package pilha;

public class PilhaImplem2 implements Pilha {
	
	/**
	 * Implementação 2: O topo é a posição!
	 */
	
	private Integer[] pilha;
	private int posicao = -1;

	public PilhaImplem2(int tamanho) {
		pilha = new Integer[tamanho];
	}

	@Override
	public void inserirTopo(Integer valor) {
		if (pilhaCheia()) {
			System.out.println("Pilha cheia. Elemento nao inserido");
			return;
		}

		pilha[++posicao] = valor;
	}

	@Override
	public Integer removerTopo() {
		if (pilhaVazia()) {
			System.out.println("Pilha vazia. Nao ha elementos para remocao.");
			return null;
		}

		Integer elementoRemovido = pilha[posicao];
		pilha[posicao--] = null;
		return elementoRemovido;
	}

	@Override
	public boolean pilhaCheia() {
		return pilha.length == posicao + 1;
	}

	@Override
	public boolean pilhaVazia() {
		return posicao == -1;
	}

	@Override
	public void imprimirPilha() {
		if (pilhaVazia()) {
			System.out.println("Pilha vazia. Nao ha o que imprimir.");
			return;
		}
		for (int i = 0; i <= posicao; i++) {
			System.out.print(pilha[i] + "\t");
		}
		System.out.println();
	}

}
