package pratica4;

public class Teste {
	public static void main(String[] args) {
		int[] comando = {2, 5, 8, 3, 5, 8, 3, 5, 8, 3, 5, 3, 1, 5, 2, 2, 5, 3, 1, 6, 9};
		Tabuleiro T = new Tabuleiro(comando, 10, 10);
		T.procedimentos();
	}
}
