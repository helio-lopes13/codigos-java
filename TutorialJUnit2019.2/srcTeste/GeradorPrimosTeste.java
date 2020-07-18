import junit.framework.TestCase;

public class GeradorPrimosTeste extends TestCase {

	GeradorPrimos geradorPrimos = new GeradorPrimos();

	public void testePrimosGeradosAteNumeroDois() throws Exception {
		verificaPrimosGerados("2", 2);
	}

	public void testePrimosGeradosAteNumeroTres() throws Exception {
		verificaPrimosGerados("2, 3", 3);
	}
	
	public void testePrimosGeradosAteNumeroQuatro() throws Exception {
		verificaPrimosGerados("2, 3", 4);
	}
	
	public void testePrimosGeradosAteNumeroCinco() throws Exception {
		verificaPrimosGerados("2, 3, 5", 5);
	}
	
	public void testePrimosGeradosAteNumeroDez() throws Exception {
		verificaPrimosGerados("2, 3, 5, 7", 10);
	}
	
	public void testePrimosGeradosAteNumeroVinteEDois() throws Exception {
		verificaPrimosGerados("2, 3, 5, 7, 11, 13, 17, 19", 22);
	}

	private void verificaPrimosGerados(String listaEsperada, int numeroMaximo) throws Exception {
		assertEquals(listaEsperada, geradorPrimos.gerarPrimosAte(numeroMaximo));
	}

	public void testeSeRejeitaValorMaximoUm() throws Exception {
		verificaSeRejeitaValoresMenoresQueDois(1);
	}

	public void testeSeRejeitaValorMaximoZero() throws Exception {
		verificaSeRejeitaValoresMenoresQueDois(0);
	}
	
	public void testeSeRejeitaValorMaximoNegativo() throws Exception {
		verificaSeRejeitaValoresMenoresQueDois(-1);
	}

	private void verificaSeRejeitaValoresMenoresQueDois(int valorMaximo) throws Exception {
		try {
			geradorPrimos.gerarPrimosAte(valorMaximo);
			fail("Deveria ter lancado ValorMaximoInvalidoException");
		} catch (ValorMaximoInvalidoException e) {
			assertTrue(true);
		}
	}
	
	public void testeInicializacaoListaPotenciaisPrimos() throws Exception {
		int valorMaximo = 5;
		boolean [] ehPrimo = geradorPrimos.inicializaListaPotenciaisPrimos(valorMaximo);
		verificaSeEhPrimo(0, false, ehPrimo[0]);
		verificaSeEhPrimo(1, false, ehPrimo[1]);
		for (int i = GeradorPrimos.MENOR_PRIMO; i <= valorMaximo; i++) {
			verificaSeEhPrimo(i, true, ehPrimo[i]);;
		}
	}
	
	private void verificaSeEhPrimo(int i, boolean valorEsperado, boolean numero) {
		assertEquals("ehPrimo[" + i + "]", valorEsperado, numero);
	}
}
