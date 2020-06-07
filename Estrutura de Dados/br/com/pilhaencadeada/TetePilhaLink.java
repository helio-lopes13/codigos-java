package pilhaencadeada;

public class TetePilhaLink {

	public static void main(String[] args) {
		PilhaLink pilha = new PilhaLinkImplem();
		
		pilha.imprimirPilha();
		pilha.removerTopo();
		
		pilha.inserirTopo(10);
		pilha.imprimirPilha();
		
		pilha.inserirTopo(12);
		pilha.imprimirPilha();
		
		pilha.inserirTopo(14);
		pilha.imprimirPilha();
		
		pilha.inserirTopo(16);
		pilha.imprimirPilha();
		
		pilha.inserirTopo(18);
		pilha.imprimirPilha();
		
		pilha.inserirTopo(20);
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
		
		pilha.removerTopo();
		pilha.imprimirPilha();
	}

}
