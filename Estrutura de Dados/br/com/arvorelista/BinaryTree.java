package arvorelista;

public class BinaryTree<E> {

	public BTNode<E> raiz;

	public BinaryTree() {
		raiz = null;
	}

	// insere um nó raiz na árvore vazia
	public BTNode<E> inserirRaiz(E valor) {
		if (raiz != null)
			throw new IllegalStateException("A árvore já tem raiz");
		raiz = new BTNode<E>(valor, null, null, null);
		return raiz;
	}

	// insere um filho à esquerda do dado pai
	public BTNode<E> inserirEsq(BTNode<E> pai, E valor) {
		if (pai.esq != null)
			throw new IllegalStateException("Este nó já tem filho à esquerda");
		BTNode<E> aux = new BTNode<E>(valor, pai, null, null);
		pai.esq = aux;
		return aux;
	}

	// insere um filho à esquerda do dado pai
	public BTNode<E> inserirDir(BTNode<E> pai, E valor) {
		if (pai.dir != null)
			throw new IllegalStateException("Este nó já tem filho à direita");
		BTNode<E> aux = new BTNode<E>(valor, pai, null, null);
		pai.dir = aux;
		return aux;
	}
	
	public Integer profundidade(BTNode<E> v) {
		return profundidade2(v,0);
	}
	
	// retorna a profundidade de um nodo
	private Integer profundidade2(BTNode<E> v, Integer profund) {
		if (v == raiz) {
			return profund;
		} else {
			return profundidade2(v.pai, ++profund);
		}
	}

	public void imprimirPrefixado() {
		imprimirPrefixado2(raiz);
	}

	private void imprimirPrefixado2(BTNode<E> v) {
		if (v != null) {
			System.out.println(v.valor);
			imprimirPrefixado2(v.esq);
			imprimirPrefixado2(v.dir);
		}
	}
	
	public void imprimirPosfixado() {
		imprimirPosfixado2(raiz);
	}

	private void imprimirPosfixado2(BTNode<E> v) {
		if (v != null) {
			imprimirPosfixado2(v.esq);
			imprimirPosfixado2(v.dir);
			System.out.println(v.valor);
		}
	}
	
	public void imprimirInterfixado() {
		imprimirInterfixado2(raiz);
	}

	private void imprimirInterfixado2(BTNode<E> v) {
		if (v != null) {
			imprimirInterfixado2(v.esq);
			System.out.println(v.valor);
			imprimirInterfixado2(v.dir);
		}
	}
}
