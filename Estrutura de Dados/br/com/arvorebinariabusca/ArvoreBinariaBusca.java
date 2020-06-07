package arvorebinariabusca;

public class ArvoreBinariaBusca {
	
	public BTSNode raiz;
	
	// InsereNo
	
	
	public void insereNo(BTSNode noBase, Integer valor) {
		
		if(raiz == null) {
			raiz = new BTSNode(valor, null, null, null);
			return;
		}
		
		if(valor > noBase.getValor()) { // Procura um local para inserir a direita
			
			if(noBase.getDir() == null) {
				BTSNode novoNo = new BTSNode(valor, noBase, null, null);
				noBase.setDir(novoNo);
			} else {
				insereNo(noBase.getDir(), valor);
			}
			
		} else if (valor < noBase.getValor()) { // Procura um local para inserir a esquerda
			
			if(noBase.getEsq() == null) {
				BTSNode novoNo = new BTSNode(valor, noBase, null, null);
				noBase.setEsq(novoNo);
			} else {
				insereNo(noBase.getEsq(), valor);
			}
			
		} else if (valor == noBase.getValor()) { 
			System.out.println("Valor já inserido na árvore. Não pode inserir duplicado");
		}
	}
	
	
	// RemoveNo
	
	// PesquisaNo
	
	// imprimirPrefixado
	
	public void imprimirPrefixadoNoBase(BTSNode noBase){
		if(noBase != null){
			System.out.print(noBase.getValor() + "\t");
			imprimirPrefixadoNoBase(noBase.getEsq());
			imprimirPrefixadoNoBase(noBase.getDir());
		}
	}
	
	// imprimirPosfixado
	
	// imprimirInterfixado

}
