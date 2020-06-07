package pratica6;

public class Livro extends Produto {
	private String autor;
	private String editora;
	private int numeroPaginas;
	private String genero;

	public Livro(String nome, int codigo, double preco, String autor, String editora, int numeroPaginas,
			String genero) {
		super(nome, codigo, preco);
		this.autor = autor;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
	}

	public String toString() {
		return "-------Livro-------\n" + super.toString() + "Autor: " + this.autor + "\nEditora: " + this.editora
				+ "\nNumero de paginas: " + this.numeroPaginas + "\nGenero: " + this.genero + "\n";
	}
	
	public boolean equals(Object arg0) {
		return super.equals(arg0) && arg0 instanceof Livro;
	}
}
