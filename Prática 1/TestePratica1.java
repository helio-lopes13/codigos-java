import java.util.Scanner;

public class TestePratica1 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Fatoriais de 1 a 10: ");
		SequenciasMatematicas.fatorial();
		
		System.out.print("Digite o número desejado de elementos da série harmônica: ");
		int n = scan.nextInt();
		SequenciasMatematicas.serieHarmonica(n);
		
		System.out.print("Digite o valor para x maior que 0: ");
		int x = scan.nextInt();
		SequenciasMatematicas.sequenciaX(x);
		
		System.out.print("Digite o número para formar a tabela de potências: ");
		int expoente = scan.nextInt();
		SequenciasMatematicas.piramidePotencia(expoente);
	}

}
