package fila;

public interface Fila {
	
	/*
	*Métodos principais
	*/
	
	public void inserirElemento(Integer valor);
	public Integer removerElemento();
	
	/*
	*Métodos auxiliares
	*/
	
	public boolean filaCheia();
	public boolean filaVazia();
	public void imprimirFila();
	
}
