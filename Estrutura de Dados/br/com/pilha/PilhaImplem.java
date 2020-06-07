package pilha;

public class PilhaImplem implements Pilha {

	/**
	 * Implementacao 1: O topo eh o inicio do vetor!
	 */

	private Integer[] pilha;
	private int posicao = -1;

	public PilhaImplem(int tamanho) {
		pilha = new Integer[tamanho];
	}

	@Override
	public void inserirTopo(Integer valor) {
		if (pilhaCheia()) {
			System.out.println("Pilha cheia. Elemento nao inserido.");
			return;
		}

		for (int i = ++posicao; i > 0; i--) {
			pilha[i] = pilha[i - 1];
		}

		pilha[0] = valor;
	}

	@Override
	public Integer removerTopo() {
		if (pilhaVazia()) {
			System.out.println("Pilha vazia. Nao ha o que remover.");
			return null;
		}

		Integer elementoRemovido = pilha[0];
		for (int i = 0; i < posicao; i++) {
			pilha[i] = pilha[i + 1];
		}
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
