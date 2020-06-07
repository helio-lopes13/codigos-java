
public class Empres�rio {
	private String nome;
	private int numeroFuncionarios;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		if (numeroFuncionarios > 0)
			this.numeroFuncionarios = numeroFuncionarios;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double pagarFuncion�rio (double quantia) {
		if (quantia < 0 || quantia > this.saldo) {
			System.out.println("Pagamento inv�lido.");
			return 0;
		}
		saldo -= quantia;
		return quantia;
	}
	
	public void show () {
		System.out.println("Nome: " + this.nome + ".");
		System.out.println("N�mero de funcion�rios: " + this.numeroFuncionarios + ".");
		System.out.println("Saldo: " + String.format("%.2f", this.saldo));
		System.out.println();
	}
}
