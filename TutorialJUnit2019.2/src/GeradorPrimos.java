

public class GeradorPrimos {
	
	public static final int MENOR_PRIMO = 2;
	
	public String gerarPrimosAte(int valorMaximo) throws ValorMaximoInvalidoException {
		if (valorMaximo >= MENOR_PRIMO) {
			return numerosPrimos(valorMaximo);
		} else {
			throw new ValorMaximoInvalidoException();
		}
	}
	
	private String numerosPrimos(int valorMaximo) {
		boolean[] ehPrimo = inicializaListaPotenciaisPrimos(valorMaximo);
		for (int valor = MENOR_PRIMO; valor <= valorMaximo; valor++) {
			if(ehPrimo[valor]) {
				for (int naoPrimos = MENOR_PRIMO * valor; naoPrimos <= valorMaximo; naoPrimos += valor) {
					ehPrimo[naoPrimos] = false;
				}
			}
		}
		return apresentaResultado(valorMaximo, ehPrimo);
	}
	
	private String apresentaResultado(int valorMaximo, boolean[] ehPrimo) {
		String resultado = String.valueOf(MENOR_PRIMO);
		for (int i = MENOR_PRIMO + 1; i <= valorMaximo; i++) {
			if (ehPrimo[i]) {
				resultado += ", " + i;
			}
		}
		return resultado;
	}
	
	boolean[] inicializaListaPotenciaisPrimos(int valorMaximo) {
		boolean [] resultado = new boolean[valorMaximo + 1];
		resultado[0] = resultado[1] = false;
		for (int i = MENOR_PRIMO; i < resultado.length; i++) {
			resultado[i] = true;
		}
		return resultado;
	}
}
