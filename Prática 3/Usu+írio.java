package prática3;

public class Usuário {
	protected String nome;
	protected String matricula;
	protected int cargaHorariaTotal;
	
	Usuário(String nome, String matricula, int cargaHorariaTotal) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargaHorariaTotal = cargaHorariaTotal;
	}
	
	public String toString () {
		return "Nome: " + this.nome + "\nMatrícula: " + this.matricula + "\nCarga horária total: " + this.cargaHorariaTotal + "\n";
	}
}
