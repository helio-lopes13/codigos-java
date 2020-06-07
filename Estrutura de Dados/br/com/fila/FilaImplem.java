package fila;

public class FilaImplem implements Fila {

	private Integer[] fila;
	private int posicao = -1;

	public FilaImplem(int tamanho) {
		fila = new Integer[tamanho];
	}

	@Override
	public void inserirElemento(Integer valor) {
		if (filaCheia()) {
			System.out.println("Fila cheia. Elemento nao inserido.");
			return;
		}
		fila[++posicao] = valor;
	}

	@Override
	public Integer removerElemento() {
		if (filaVazia()) {
			System.out.println("Fila vazia. Nao ha o que remover.");
			return null;
		}

		Integer elementoRemovido = fila[0];
		for (int i = 0; i < posicao; i++) {
			fila[i] = fila[i + 1];
		}

		fila[posicao--] = null;

		return elementoRemovido;
	}

	@Override
	public boolean filaCheia() {
		return fila.length == posicao + 1;
	}

	@Override
	public boolean filaVazia() {
		return posicao == -1;
	}

	@Override
	public void imprimirFila() {
		if (filaVazia()) {
			System.out.println("Fila vazia. Nao ha o que imprimir.");
			return;
		}
		for (int i = 0; i <= posicao; i++) {
			System.out.print(fila[i] + "\t");
		}
		System.out.println();
	}

}
