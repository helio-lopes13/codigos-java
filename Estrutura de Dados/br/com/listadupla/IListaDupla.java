package listadupla;

public interface IListaDupla<E> {
	
	//Métodos principársias
	
	public void inserirInicio(E valor);
	public void inserirFim(E valor);
	public void inserirPosicao(E valor, int posicao);
	
	public void removerInicio();
	public void removerFim();
	public void removerPosicao(int posicao);
	
	//Métodos auxiliares
	
	public void imprimirLista();
	public boolean listaVazia();
}
