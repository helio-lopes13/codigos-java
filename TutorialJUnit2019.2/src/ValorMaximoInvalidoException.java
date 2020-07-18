public class ValorMaximoInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorMaximoInvalidoException() {
		super("O valor maximo deve ser maior ou igual a 2");
	}
}
