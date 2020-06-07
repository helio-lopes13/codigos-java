package br.com.prova;

public class Node {
	private Integer valor;
	private Node proximo;
	
	public Node(Integer valor, Node proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	
}
