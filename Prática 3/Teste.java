package pr�tica3;

public class Teste {

	public static void main(String[] args) {
		Usu�rio U = new Usu�rio("Jos�", "102", 40);
		Aluno A = new Aluno("Jo�o", "85");
		
		A.matricular(1,"C�lculo");
		A.matricular(2, "POO", 60.0f, 5);
		A.matricular(3, "F�sica", 40.0f);
		A.calcularCargaHoraria();
		
		System.out.println(U.toString());
		System.out.println(A.toString());

	}

}
