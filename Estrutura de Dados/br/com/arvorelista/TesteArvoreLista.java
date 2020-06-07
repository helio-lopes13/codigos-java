package arvorelista;

public class TesteArvoreLista {
	public static void main(String[] args) {
		BinaryTree<Character> arvore = new BinaryTree<Character>();
		arvore.inserirRaiz('-');
		arvore.inserirEsq(arvore.raiz, '/');
		arvore.inserirDir(arvore.raiz, '+');
		arvore.inserirEsq(arvore.raiz.esq, 'x');
		arvore.inserirDir(arvore.raiz.esq, '+');
		arvore.inserirEsq(arvore.raiz.dir, 'x');
		arvore.inserirDir(arvore.raiz.dir, '6');
		arvore.inserirEsq(arvore.raiz.esq.esq, '+');
		arvore.inserirDir(arvore.raiz.esq.esq, '3');
		arvore.inserirEsq(arvore.raiz.esq.dir, '-');
		arvore.inserirDir(arvore.raiz.esq.dir, '2');
		arvore.inserirEsq(arvore.raiz.dir.esq, '3');
		arvore.inserirDir(arvore.raiz.dir.esq, '-');
		arvore.inserirEsq(arvore.raiz.esq.esq.esq, '3');
		arvore.inserirDir(arvore.raiz.esq.esq.esq, '1');
		arvore.inserirEsq(arvore.raiz.esq.dir.esq, '9');
		arvore.inserirDir(arvore.raiz.esq.dir.esq, '5');
		arvore.inserirEsq(arvore.raiz.dir.esq.dir, '7');
		arvore.inserirDir(arvore.raiz.dir.esq.dir, '4');
		arvore.imprimirInterfixado();
	}
}
