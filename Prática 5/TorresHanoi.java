package pratica5;

public class TorresHanoi {
	private Pino A, B, C;
	private int passo;

	public TorresHanoi(int tamanhoProblema) {
		A = new Pino(tamanhoProblema);
		B = new Pino(tamanhoProblema);
		C = new Pino(tamanhoProblema);
		A.preencher();
	}

	public void mover(Pino pino1, Pino pino2) {
		pino2.insere(pino1.retira());
	}

	public void exibir() {
		System.out.println("Passo " + passo);
		System.out.print("A");
		A.exibir();
		System.out.print("B");
		B.exibir();
		System.out.print("C");
		C.exibir();
		System.out.println("-----------------------");
	}

	public void solucionar(int n, Pino O, Pino D, Pino T) {
        if (n > 0) {
            solucionar(n - 1, O, T, D);
            passo++;
            mover(O, D);
            exibir();
            solucionar(n - 1, T, D, O);
        }
	}

	public void solucionar() {
		exibir();
		solucionar(A.getTamanho(), A, C, B);
	}
}
