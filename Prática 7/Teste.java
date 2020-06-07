package pratica6;

public class Teste {
	public static void main(String[] args) {
		Loja l = new Loja(10);
		l.cadastrarProduto(new Livro("Percy Jackson e a Lavanderia de Aco Divino", 106, 49.90, "Rick Riordan",
				"Intrinseca", 490, "Acao/Aventura"));
		l.cadastrarProduto(new Disco("Dirty Computer", 109, 89.90, "Janelle Monae", "R&B", 15));
		l.cadastrarProduto(new Livro("World of Warcraft: A Vida de Teldrassil apos a sua Queima", 105, 39.90,
				"Abigail Breslin", "Abril", 490, "Drama"));
		l.cadastrarProduto(new Produto("Barbie Maniaca do Bairro", 103, 149.90));
		l.cadastrarProduto(new Livro("Terra X", 104, 59.90, "Chris Claremont", "Panini", 490, "Acao/Aventura"));
		l.cadastrarProduto(new Produto("Caixinha de Som", 101, 129.90));
		l.cadastrarProduto(new Disco("Zadnja Avantura", 108, 399.90, "September", "Jazz", 10));
		l.cadastrarProduto(new Produto("Guarda-chuva", 102, 24.90));
		l.cadastrarProduto(new Disco("Choose Your Weapon", 107, 279.90, "Hiatus Kaiyote", "Neo-soul", 18));
		l.listarProdutos();
		System.out.println("---------------------------Livros listados---------------------------");
		l.listarLivros();
		System.out.println("---------------------------Discos listados---------------------------");
		l.listarDiscos();
		l.cadastrarProduto(new Produto("Caixinha de Som", 101, 129.90));
		l.listarProdutos();
	}
}
