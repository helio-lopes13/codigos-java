package lista;

public interface Lista {
	//M�todos principais
	
	public void inserirInicio(Integer valor);
	public Integer removerInicio();
	public void inserirFinal(Integer valor);
	public Integer removerFinal();
	public void inserirIndice(Integer valor, int indice);
	public Integer removerIndice(int indice);
	
	//M�todos auxiliares
	
	public boolean listaCheia();
	public boolean listaVazia();
	public void imprimirLista();
}
