package pratica6;

public class Loja {
	private Produto[] produtos;
	private int indice;
	
	public Loja(int tamanho) {
		this.produtos = new Produto[tamanho];
	}

	public void cadastrarProduto(Produto P) {
		produtos[indice++] = P;
	}

	public void listarProdutos() {
		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i].toString());
		}
	}
}
