package lista;

public interface Lista {
	//Métodos principais
	
	public void inserirInicio(Integer valor);
	public Integer removerInicio();
	public void inserirFinal(Integer valor);
	public Integer removerFinal();
	public void inserirIndice(Integer valor, int indice);
	public Integer removerIndice(int indice);
	
	//Métodos auxiliares
	
	public boolean listaCheia();
	public boolean listaVazia();
	public void imprimirLista();
}
