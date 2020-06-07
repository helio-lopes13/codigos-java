package listadupla;

public interface IListaDupla<E> {
	
	//M�todos princip�rsias
	
	public void inserirInicio(E valor);
	public void inserirFim(E valor);
	public void inserirPosicao(E valor, int posicao);
	
	public void removerInicio();
	public void removerFim();
	public void removerPosicao(int posicao);
	
	//M�todos auxiliares
	
	public void imprimirLista();
	public boolean listaVazia();
}
