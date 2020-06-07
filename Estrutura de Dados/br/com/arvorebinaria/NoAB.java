package arvorebinaria;

public class NoAB<H> {
	private NoAB<H> noPai, noEsquerdo, noDireito;
	private H valor;
	
	public NoAB(H valor) {
		this.noPai = null;
		this.noEsquerdo = null;
		this.noDireito = null;
		this.valor = valor;
	}

	public NoAB<H> getNoPai() {
		return noPai;
	}

	public void setNoPai(NoAB<H> noPai) {
		this.noPai = noPai;
	}

	public NoAB<H> getNoEsquerdo() {
		return noEsquerdo;
	}

	public void setNoEsquerdo(NoAB<H> noEsquerdo) {
		this.noEsquerdo = noEsquerdo;
	}

	public NoAB<H> getNoDireito() {
		return noDireito;
	}

	public void setNoDireito(NoAB<H> noDireito) {
		this.noDireito = noDireito;
	}

	public H getValor() {
		return valor;
	}

	public void setValor(H valor) {
		this.valor = valor;
	}
	
}
