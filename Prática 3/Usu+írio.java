package pr�tica3;

public class Usu�rio {
	protected String nome;
	protected String matricula;
	protected int cargaHorariaTotal;
	
	Usu�rio(String nome, String matricula, int cargaHorariaTotal) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargaHorariaTotal = cargaHorariaTotal;
	}
	
	public String toString () {
		return "Nome: " + this.nome + "\nMatr�cula: " + this.matricula + "\nCarga hor�ria total: " + this.cargaHorariaTotal + "\n";
	}
}
