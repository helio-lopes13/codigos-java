package pratica4;

public class Tabuleiro {
	private boolean[][] tabu = new boolean[20][20];
	private Tartaruga Tag;
	private final char[] cardeais = { 'N', 'L', 'S', 'O' };

	public Tabuleiro(int[] comando, int linha, int coluna) {
		this.Tag = new Tartaruga(comando, linha, coluna);
	}

	public Tabuleiro(int[] comando, char orientacao, int linha, int coluna) {
		this.Tag = new Tartaruga(comando, orientacao, linha, coluna);
	}

	public void procedimentos() {
		int[] acao = Tag.getComando();
		for (int i = 0; acao[i] != 9; i++) {
			switch (acao[i]) {
			case 1:
				Tag.setCaneta(true);
				break;

			case 2:
				Tag.setCaneta(false);
				break;

			case 3:
				virarEsquerda();
				break;

			case 4:
				virarDireita();
				break;

			case 5:
				andar(acao[++i]);
				break;

			case 6:
				printMatrix();
				break;
			}
		}
	}

	public void printMatrix() {
		for (int i = 0; i < tabu.length; i++) {
			String str = "";
			for (int j = 0; j < tabu[i].length; j++) {
				if (tabu[i][j]) {
					str += "● ";
				} else {
					str += "○ ";
				}
			}
			System.out.println(str);
		}
	}

	public void virarEsquerda() {
		for (int i = 0; i < cardeais.length; i++) {
			if (Tag.getOrientacao() == cardeais[i]) {
				if (i == 0) {
					Tag.setOrientacao(cardeais[3]);
					break;
				} else {
					Tag.setOrientacao(cardeais[i - 1]);
					break;
				}
			}
		}
	}

	public void virarDireita() {
		for (int i = 0; i < cardeais.length; i++) {
			if (Tag.getOrientacao() == cardeais[i]) {
				if (i == 3) {
					Tag.setOrientacao(cardeais[0]);
					break;
				} else {
					Tag.setOrientacao(cardeais[i + 1]);
					break;
				}
			}
		}
	}

	public void andar(int passos) {
		switch (Tag.getOrientacao()) {
		case 'N':
			for (int i = 0; i < passos; i++) {
				tabu[Tag.getLinha() - i][Tag.getColuna()] = Tag.isCaneta();
			}
			Tag.setLinha(-passos);
			break;

		case 'L':
			for (int i = 0; i < passos; i++) {
				tabu[Tag.getLinha()][Tag.getColuna() + i] = Tag.isCaneta();
			}
			Tag.setColuna(passos);
			break;

		case 'S':
			for (int i = 0; i < passos; i++) {
				tabu[Tag.getLinha() + i][Tag.getColuna()] = Tag.isCaneta();
			}
			Tag.setLinha(passos);
			break;

		case 'O':
			for (int i = 0; i < passos; i++) {
				tabu[Tag.getLinha()][Tag.getColuna() - i] = Tag.isCaneta();
			}
			Tag.setColuna(-passos);
			break;
		}
	}
}
