
public class TestePr�tica2 {

	public static void main(String[] args) {
		
		Funcion�rio F1 = new Funcion�rio();
		Funcion�rio F2 = new Funcion�rio();
		Funcion�rio F3 = new Funcion�rio();
		Empres�rio Tio = new Empres�rio();
		
		F1.setNome("Maria");
		F1.setNumeroIdentificacao(0001);
		F1.setSalario(2000.00);
		
		F2.setNome("Jo�o");
		F2.setNumeroIdentificacao(0002);
		F2.setSalario(1900.00);
		
		F3.setNome("Marcelo");
		F3.setNumeroIdentificacao(0003);
		F3.setSalario(2700.00);
		
		Tio.setNome("Mateus");
		Tio.setNumeroFuncionarios(3);
		Tio.setSaldo(7000.00);
		
		
		F1.show();
		F2.show();
		F3.show();
		Tio.show();
		
		System.out.println("Pagamentos realizados.");
		
		F1.setSaldo(Tio.pagarFuncion�rio(F1.getSalario()));
		F2.setSaldo(Tio.pagarFuncion�rio(F2.getSalario()));
		F3.setSaldo(Tio.pagarFuncion�rio(F3.getSalario()));
		
		F1.show();
		F2.show();
		F3.show();
		Tio.show();
		
		System.out.println("Testando pagamento inv�lido: ");
		F2.setSaldo(F2.getSaldo() + Tio.pagarFuncion�rio(-300));
		
		F2.show();
		Tio.show();
		
		System.out.println("Testando pagamento indevido: ");
		F3.setSaldo(2000);
		
		F3.show();
		
		System.out.println("Pagando adicional de 15%:");
		F2.setSaldo(F2.getSaldo() + Tio.pagarFuncion�rio(0.15 * F2.getSalario()));
		
		F2.show();
		Tio.show();
	}
	
}
