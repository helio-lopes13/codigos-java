package arvorebinaria;

public interface IArvoreBinaria<H> {
	/*
	 * Métodos principais
	 */
	
	public void inserirRaiz(H valor);
	public void inserirDireito(NoAB<H> pai, H valor);
	public void inserirEsquerdo(NoAB<H> pai, H valor);
	public H removerElemento();
	
	/*
	 * Métodos auxiliares
	 */
	
	public void caminhoInterfixado(NoAB<H> v);
	public boolean arvoreVazia();
}
