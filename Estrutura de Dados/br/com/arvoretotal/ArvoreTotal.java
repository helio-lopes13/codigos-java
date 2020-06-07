package arvoretotal;

public class ArvoreTotal<E> {
	public NoANB<E> raiz;

	public ArvoreTotal() {
		raiz = null;
	}

	// insere um n� raiz na �rvore vazia
	public void inserirRaiz(E valor) {
		if (raiz != null)
			throw new IllegalStateException("A �rvore j� tem raiz");
		raiz = new NoANB<E>(valor, null);
	}

	// insere um filho ao dado pai
	public void inserirFilho(E valor, NoANB<E> pai) {
		pai.dar�LuzAUmFilho(valor);
	}

	public Integer profundidade(NoANB<E> v) {
		return profundidade2(v, 0);
	}

	// retorna a profundidade de um nodo
	private Integer profundidade2(NoANB<E> v, Integer profund) {
		if (v == raiz) {
			return profund;
		} else {
			return profundidade2(v.getPai(), ++profund);
		}
	}

	public void imprimirPrefixado() {
		imprimirPrefixado2(raiz);
	}

	private void imprimirPrefixado2(NoANB<E> v) {
		if (v != null) {
			System.out.println("Elemento: " + v.getValor() + " Profundidade: " + profundidade(v));
			for (int i = 0; i < v.qntdFilhos(); i++) {
				imprimirPrefixado2(v.getFilho(i));
			}
		}
	}

	public void imprimirPosfixado() {
		imprimirPosfixado2(raiz);
	}

	private void imprimirPosfixado2(NoANB<E> v) {
		if (v != null) {
			for (int i = 0; i < v.qntdFilhos(); i++) {
				imprimirPosfixado2(v.getFilho(i));
			}
			System.out.println("Elemento: " + v.getValor() + " Profundidade: " + profundidade(v));
		}
	}
	// ONEULBUTEO URINEUN
}
