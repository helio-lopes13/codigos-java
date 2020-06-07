package br.com.prova;

public interface ILista {
	/**
	 * Métodos principais
	 */
	
	public void insereInicio(Integer valor);
	public void inserePosicao(int pos, Integer valor);
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
