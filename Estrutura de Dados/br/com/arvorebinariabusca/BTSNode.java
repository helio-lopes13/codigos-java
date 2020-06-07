package arvorebinariabusca;

public class BTSNode {
	
	private Integer valor;
	
	private BTSNode pai, esq, dir;
	
	
	public BTSNode(Integer valor, BTSNode pai, BTSNode esquerda, BTSNode direita) {
		this.valor = valor;
		this.pai = pai;
		this.esq = esquerda;
		this.dir = direita;
	}
	

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public BTSNode getPai() {
		return pai;
	}

	public void setPai(BTSNode pai) {
		this.pai = pai;
	}

	public BTSNode getEsq() {
		return esq;
	}

	public void setEsq(BTSNode esq) {
		this.esq = esq;
	}

	public BTSNode getDir() {
		return dir;
	}

	public void setDir(BTSNode dir) {
		this.dir = dir;
	}
	
	
	

}
