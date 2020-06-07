package arvoretotal;

public class TesteArvoreTotal {

	public static void main(String[] args) {
		ArvoreTotal<Integer> tree = new ArvoreTotal<Integer>();
		
		tree.inserirRaiz(5);
		
		tree.inserirFilho(8, tree.raiz);
		tree.inserirFilho(2, tree.raiz);
		
		
		tree.imprimirPrefixado();
	}

}
