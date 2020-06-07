package filadupla;

public interface IFilaDupla<E> {
	// Metodos principais

	public void inserirElemento(E valor);

	public void removerElemento();

	// Metodos auxiliares

	public void imprimirFila();

	public boolean filaVazia();

}
