package pratica6;

public class Loja {
	private Produto[] produtos;
	private int indice;
	
	public Loja(int tamanho) {
		this.produtos = new Produto[tamanho];
	}

	public void cadastrarProduto(Produto P) {
		for (int i = 0; i < indice; i++) {
			if(P.equals(produtos[i])) {
				System.out.println("Este produto já foi cadastrado, não tente novamente.");
				return;
			}
		}
		produtos[indice++] = P;
	}

	public void listarProdutos() {
		for (int i = 0; i < indice; i++) {
			System.out.println(produtos[i].toString());
		}
	}
	
	public void listarLivros() {
		for (int i = 0; i < indice; i++) {
			if (produtos[i] instanceof Livro)
				System.out.println(produtos[i].toString());
		}
	}
	
	public void listarDiscos() {
		for (int i = 0; i < indice; i++) {
			if (produtos[i] instanceof Disco)
				System.out.println(produtos[i].toString());
		}
	}
}
