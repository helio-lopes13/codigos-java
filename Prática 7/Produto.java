package pratica6;

public class Produto {
	private String nome;
	private int codigo;
	private double preco;

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	public String toString() {
		return "Nome: " + this.nome + "\nCodigo: " + this.codigo + "\nPreco: R$ " + String.format("%.2f", this.preco)
				+ "\n";
	}
	
	public boolean equals(Object arg0) {
		if (arg0 instanceof Produto) {
			return ((Produto) arg0).nome.equals(this.nome) && ((Produto) arg0).codigo == this.codigo;
		}
		return false;
	}
}
