package prática3;

public class Teste {

	public static void main(String[] args) {
		Usuário U = new Usuário("José", "102", 40);
		Aluno A = new Aluno("João", "85");
		
		A.matricular(1,"Cálculo");
		A.matricular(2, "POO", 60.0f, 5);
		A.matricular(3, "Física", 40.0f);
		A.calcularCargaHoraria();
		
		System.out.println(U.toString());
		System.out.println(A.toString());

	}

}
