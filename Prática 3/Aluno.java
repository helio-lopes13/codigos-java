package prática3;

public class Aluno extends Usuário {
	private Disciplina D[] = new Disciplina[3];
	Aluno(String nome, String matricula) {
		super(nome, matricula, 0);
	}
	
	public void matricular (int indice, String nome, float cargaHoraria, int semestre) {
		D[indice - 1] = new Disciplina(nome, cargaHoraria, semestre);
	}
	
	public void matricular (int indice, String nome, int semestre) {
		D[indice - 1] = new Disciplina(nome, semestre);
	}
	
	public void matricular (int indice, String nome, float cargaHoraria) {
		D[indice - 1] = new Disciplina(nome, cargaHoraria);
	}
	
	public void matricular (int indice, String nome) {
		D[indice - 1] = new Disciplina(nome);
	}
	
	public void calcularCargaHoraria () {
		for (int i = 0; i < D.length; i++) {
			this.cargaHorariaTotal += D[i].getCargaHoraria();
		}
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < D.length; i++) {
			str += "Disciplina " + (i + 1) + ": \n" + D[i].toString(); 
		} 
		return super.toString() + str;
	}
	
	
	
}
