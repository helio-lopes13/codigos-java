
public class TestePrática2 {

	public static void main(String[] args) {
		
		Funcionário F1 = new Funcionário();
		Funcionário F2 = new Funcionário();
		Funcionário F3 = new Funcionário();
		Empresário Tio = new Empresário();
		
		F1.setNome("Maria");
		F1.setNumeroIdentificacao(0001);
		F1.setSalario(2000.00);
		
		F2.setNome("João");
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
		
		F1.setSaldo(Tio.pagarFuncionário(F1.getSalario()));
		F2.setSaldo(Tio.pagarFuncionário(F2.getSalario()));
		F3.setSaldo(Tio.pagarFuncionário(F3.getSalario()));
		
		F1.show();
		F2.show();
		F3.show();
		Tio.show();
		
		System.out.println("Testando pagamento inválido: ");
		F2.setSaldo(F2.getSaldo() + Tio.pagarFuncionário(-300));
		
		F2.show();
		Tio.show();
		
		System.out.println("Testando pagamento indevido: ");
		F3.setSaldo(2000);
		
		F3.show();
		
		System.out.println("Pagando adicional de 15%:");
		F2.setSaldo(F2.getSaldo() + Tio.pagarFuncionário(0.15 * F2.getSalario()));
		
		F2.show();
		Tio.show();
	}
	
}
