package pilha;

public interface Pilha {
	
	/*
	*Métodos principais
	*/
	
	public void inserirTopo(Integer valor);
	public Integer removerTopo();
	
	/*
	*Métodos auxiliares
	*/
	
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	public void imprimirPilha();
	
}
