
public class Funcionário {
	private String nome;
	private double salario = 0;
	private int numeroIdentificacao = 0;
	private double saldo = 0;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario > 0)
			this.salario = salario;
	}
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		if (numeroIdentificacao > 0)
			this.numeroIdentificacao = numeroIdentificacao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if (saldo != 0 && saldo >= this.salario)
			this.saldo = saldo;
		else
			System.out.println("Pagamento indevido.");
	}
	
	public void show () {
		System.out.println("Nome: " + this.nome + ".");
		System.out.println("Número de identificação: " + this.numeroIdentificacao);
		System.out.println("Salário: " + String.format("%.2f", this.salario));
		System.out.println("Saldo: " + String.format("%.2f", this.saldo));
		System.out.println();
	}
}
