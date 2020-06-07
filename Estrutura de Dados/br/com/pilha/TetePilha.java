package pilha;

public class TetePilha {

	public static void main(String[] args) {
		Pilha pilha = new PilhaImplem(10);
		
		pilha.inserirTopo(5);
		pilha.inserirTopo(3);
		pilha.removerTopo();
		pilha.inserirTopo(2);
		pilha.inserirTopo(8);
		pilha.removerTopo();
		pilha.removerTopo();
		pilha.inserirTopo(9);
		pilha.inserirTopo(1);
		pilha.removerTopo();
		pilha.inserirTopo(7);
		pilha.inserirTopo(6);
		pilha.removerTopo();
		pilha.removerTopo();
		pilha.inserirTopo(4);
		pilha.removerTopo();
		pilha.removerTopo();
		
		pilha.imprimirPilha();
	}

}
