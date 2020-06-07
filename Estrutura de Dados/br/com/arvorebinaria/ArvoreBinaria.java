package arvorebinaria;

public class ArvoreBinaria<H> implements IArvoreBinaria<H>{
	private NoAB<H> raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}

	@Override
	public void inserirRaiz(H valor) {
		if (arvoreVazia()) {
			raiz = new NoAB<H>(valor);
		} else {
			System.out.println("Raiz ja existe. Elemento nao inserido.");
		}
	}
	
	@Override
	public void inserirDireito(NoAB<H> pai, H valor) {
		if(pai == null) {
			System.out.println("No pai e nulo. Elemento nao inserido.");
			return;
		} else if(pai.getNoDireito() != null) {
			System.out.println("No direito ja existe. Elemento nao inserido");
			return;
		}
		
		NoAB<H> novoNo = new NoAB<H>(valor);
		pai.setNoDireito(novoNo);
		
	}
	
	@Override
	public void inserirEsquerdo(NoAB<H> pai, H valor) {
		if(pai == null) {
			System.out.println("No pai e nulo. Elemento nao inserido.");
			return;
		} else if(pai.getNoEsquerdo() != null) {
			System.out.println("No esquerdo ja existe. Elemento nao inserido");
			return;
		}
		NoAB<H> novoNo = new NoAB<H>(valor);
		pai.setNoEsquerdo(novoNo);
	}

	@Override
	public H removerElemento() {
		return null;
	}

	@Override
	public void caminhoInterfixado(NoAB<H> v) {
		if (v != null) {
			caminhoInterfixado(v.getNoEsquerdo());
			System.out.println(v.getValor() + "\t");
			caminhoInterfixado(v.getNoDireito());
		}
	}
	
	public void caminhoPrefixado(NoAB<H> v) {
		if (v != null) {
			System.out.println(v.getValor() + "\t");
			caminhoPrefixado(v.getNoEsquerdo());
			caminhoPrefixado(v.getNoDireito());
		}
	}
	
	public void caminhoPosfixado(NoAB<H> v) {
		if (v != null) {
			caminhoPosfixado(v.getNoEsquerdo());
			caminhoPosfixado(v.getNoDireito());
			System.out.println(v.getValor() + "\t");
		}
	}

	@Override
	public boolean arvoreVazia() {
		return raiz == null;
	}
	
	public NoAB<H> getRaiz() {
		return raiz;
	}
	
}
