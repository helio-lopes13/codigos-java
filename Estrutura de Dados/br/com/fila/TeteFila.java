package fila;

public class TeteFila {

	public static void main(String[] args) {
		Fila fila = new FilaImplem(10);

		fila.inserirElemento(5);
		fila.inserirElemento(3);
		fila.removerElemento();
		fila.inserirElemento(2);
		fila.inserirElemento(8);
		fila.removerElemento();
		fila.removerElemento();
		fila.inserirElemento(9);
		fila.inserirElemento(1);
		fila.removerElemento();
		fila.inserirElemento(7);
		fila.inserirElemento(6);
		fila.removerElemento();
		fila.removerElemento();
		fila.inserirElemento(4);
		fila.removerElemento();
		fila.removerElemento();
		
		fila.imprimirFila();

	}
}
