package pilhadupla;

public class TestePilhaDupla {

	public static void main(String[] args) {
		PilhaDupla2<Integer> pilha = new PilhaDupla2<Integer>();
		
		pilha.removerElemento();
		pilha.inserirElemento(2);
		pilha.imprimirPilha();
		pilha.inserirElemento(4);
		pilha.imprimirPilha();
		pilha.inserirElemento(6);
		pilha.imprimirPilha();
		pilha.inserirElemento(8);
		pilha.imprimirPilha();
		pilha.inserirElemento(10);
		
		pilha.imprimirPilha();
		pilha.removerElemento();
		pilha.imprimirPilha();
		pilha.removerElemento();
		pilha.imprimirPilha();
		pilha.removerElemento();
		pilha.imprimirPilha();
		pilha.removerElemento();
		pilha.imprimirPilha();
		pilha.removerElemento();
		pilha.imprimirPilha();
	}

}
