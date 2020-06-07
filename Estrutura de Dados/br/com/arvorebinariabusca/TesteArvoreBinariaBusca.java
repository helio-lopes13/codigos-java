package arvorebinariabusca;

public class TesteArvoreBinariaBusca {
	
	public static void main(String[] args) {
		
		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
		
		
		arvore.insereNo(arvore.raiz, 20);
		arvore.insereNo(arvore.raiz, 10);
		arvore.insereNo(arvore.raiz, 30);
		
		arvore.insereNo(arvore.raiz, 5);
		arvore.insereNo(arvore.raiz, 12);
		
		arvore.insereNo(arvore.raiz, 25);
		arvore.insereNo(arvore.raiz, 35);
		
		arvore.imprimirPrefixadoNoBase(arvore.raiz);
		
	}
}
