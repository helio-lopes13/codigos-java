package pratica6;

import java.text.DecimalFormat;

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
	
	public static void main(String[] args) {
		System.out.println(new DecimalFormat("#").format(2017.6074329423));
	}
}
