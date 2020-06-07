package arvoretotal;

import listadupla.ListaDupla;

public class NoANB<E> {
	private NoANB<E> pai;
	private E valor;
	private ListaDupla<NoANB<E>> filhos = new ListaDupla<NoANB<E>>();
	
	public NoANB (E valor, NoANB<E> pai) {
		this.valor = valor;
		this.pai = pai;
	}
	
	public NoANB<E> getPai() {
		return pai;
	}

	public void setPai(NoANB<E> pai) {
		this.pai = pai;
	}

	public E getValor() {
		return valor;
	}

	public void setValor(E valor) {
		this.valor = valor;
	}

	public ListaDupla<NoANB<E>> getFilhos() {
		return filhos;
	}
	
	public int qntdFilhos() {
		return filhos.getTamanho();
	}

	public void dar¿LuzAUmFilho(E valor) {
		this.filhos.inserirFim(new NoANB<E>(valor, this));
	}
	
	public void dar¿LuzAUmFilho2(NoANB<E> no) {
		this.filhos.inserirFim(no);
	}
	
	public NoANB<E> getFilho(int pos) {
		return this.getFilhos().getElemento(pos);
	}
}
