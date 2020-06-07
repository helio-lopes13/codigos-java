package listaencadeada;

public interface ListaLink {

	/**
	 * Métodos principais
	 */

	public void insereInicio(Integer valor);

	public void inserePosicao(Integer valor, int pos);

	public void insereFinal(Integer valor);

	public void removeInicio();

	public void removePosicao(int pos);

	public void removeFinal();

	/**
	 * Métodos auxiliares
	 */

	public boolean listaVazia();

	public void imprimeLista();

}
