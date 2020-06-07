package pratica4;

public class Tartaruga {
	
	private int[] comando;
	private char orientacao;
	private int linha;
	private int coluna;
	private boolean caneta;
	
	public Tartaruga(int[] comando, char orientacao, int linha, int coluna) {
		this.comando = comando;
		setOrientacao(orientacao);
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public Tartaruga(int[] comando, int linha, int coluna) {
		this(comando, 'N', linha, coluna);
	}

	public int[] getComando() {
		return comando;
	}

	public void setComando(int[] comando) {
		this.comando = comando;
	}

	public char getOrientacao() {
		return orientacao;
	}

	public void setOrientacao(char orientacao) {
		this.orientacao = Character.toUpperCase(orientacao);
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha += linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna += coluna;
	}

	public boolean isCaneta() {
		return caneta;
	}

	public void setCaneta(boolean caneta) {
		this.caneta = caneta;
	}
	
	
}
