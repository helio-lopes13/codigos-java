package arvorelista;

public class BTNode<E> {

	public E valor;
	public BTNode<E> pai, esq, dir;
	
	public BTNode(E valor, BTNode<E> pai, BTNode<E> esq, BTNode<E> dir) {
		this.valor = valor;
		this.pai = pai;
		this.esq = esq;
		this.dir = dir;
	}
}
