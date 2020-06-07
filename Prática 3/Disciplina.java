package prática3;

public class Disciplina {
	private String nome;
	private float cargaHoraria;
	private int semestre;
	
	Disciplina(String nome, float cargaHoraria, int semestre) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.semestre = semestre;
	}
	
	Disciplina(String nome, int semestre) {
		this(nome,80,semestre);
	}
	
	Disciplina(String nome, float cargaHoraria) {
		this(nome,cargaHoraria, 1);
	}
	
	Disciplina(String nome) {
		this(nome,80,1);
	}
	
	public float getCargaHoraria () {
		return cargaHoraria;
	}

	public String toString() {
		return "Nome: " + this.nome + "\nCarga horária: " + (int) this.cargaHoraria + "\nSemestre: " + this.semestre + "\n";
	}
}
