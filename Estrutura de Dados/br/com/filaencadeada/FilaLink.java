package filaencadeada;

public interface FilaLink {
	//Metodos principais
	
	public void inserirElemento(Integer valor);
	public Integer removerElemento();
	
	//Metodos auxiliares
	
	public boolean filaVazia();
	public void imprimirFila();
}
