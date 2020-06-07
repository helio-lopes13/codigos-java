package pratica5;

import java.util.ArrayList;

public class Pino {
	private ArrayList<Integer> pino;
	private int tamanho;

	public Pino(int tamanho) {
		this.pino = new ArrayList<Integer>();
		this.tamanho = tamanho;
	}

	public void preencher() {
		for (int i = 0; i < tamanho; i++) {
			pino.add(tamanho - i);
		}
	}

	public void insere(int disco) {
		pino.add(disco);
	}

	public int retira() {
		int disco = pino.get(pino.size() - 1);
		pino.remove(pino.size() - 1);
		return disco;
	}

	public void exibir() {
		String str = "* ";
		for (int i = 0; i < pino.size(); i++) {
			str += pino.get(i) + " ";
		}
		System.out.println(str);
	}

	public int getTamanho() {
		return this.tamanho;
	}
}
