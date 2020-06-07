package pratica6;

public class Disco extends Produto {

	private String banda;
	private String estilo;
	private int numeroFaixas;

	public Disco(String nome, int codigo, double preco, String banda, String estilo, int numeroFaixas) {
		super(nome, codigo, preco);
		this.banda = banda;
		this.estilo = estilo;
		this.numeroFaixas = numeroFaixas;
	}

	public String toString() {
		return "-------Disco-------\n" + super.toString() + "Autor: " + this.banda + "\nEditora: " + this.estilo
				+ "\nNumero de faixas: " + this.numeroFaixas + "\n";
	}
}
