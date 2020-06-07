package filadupla;

public class NoDuplo<E> {
	private E valor;
	private NoDuplo<E> anterior, proximo;
	
	public NoDuplo(E valor, NoDuplo<E> anterior, NoDuplo<E> proximo) {
		this.valor = valor;
		this.anterior = anterior;
		this.proximo = proximo;
	}
	
	public NoDuplo(E valor) {
		this.valor = valor;
		this.anterior = null;
		this.proximo = null;
	}

	public E getValor() {
		return valor;
	}

	public void setValor(E valor) {
		this.valor = valor;
	}

	public NoDuplo<E> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoDuplo<E> anterior) {
		this.anterior = anterior;
	}

	public NoDuplo<E> getProximo() {
		return proximo;
	}

	public void setProximo(NoDuplo<E> proximo) {
		this.proximo = proximo;
	}
	
	
}
