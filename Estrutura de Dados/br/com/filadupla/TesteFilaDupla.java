package filadupla;

public class TesteFilaDupla {

	public static void main(String[] args) {
		FilaDupla<Integer> fila = new FilaDupla<Integer>();

		fila.removerElemento();
		fila.inserirElemento(2);
		fila.imprimirFila();
		fila.inserirElemento(4);
		fila.imprimirFila();
		fila.inserirElemento(6);
		fila.imprimirFila();
		fila.inserirElemento(8);
		fila.imprimirFila();
		fila.inserirElemento(10);

		fila.imprimirFila();
		fila.removerElemento();
		fila.imprimirFila();
		fila.removerElemento();
		fila.imprimirFila();
		fila.removerElemento();
		fila.imprimirFila();
		fila.removerElemento();
		fila.imprimirFila();
		fila.removerElemento();
		fila.imprimirFila();

	}

}
