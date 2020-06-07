package pilhadupla;

public interface IPilhaDupla<E> {
	// Metodos principais

	public void inserirElemento(E valor);

	public void removerElemento();

	// Metodos auxiliares

	public void imprimirPilha();

	public boolean pilhaVazia();

}
