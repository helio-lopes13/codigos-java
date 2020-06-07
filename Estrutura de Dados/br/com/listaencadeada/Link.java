package listaencadeada;

public class Link {
	private Integer valor;
	private Link proximo;
	
	public Link (Integer valor, Link proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Link getProximo() {
		return proximo;
	}

	public void setProximo(Link proximo) {
		this.proximo = proximo;
	}

}