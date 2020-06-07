package simplex;

import java.util.Scanner;

import Jama.Matrix;

public class Teste {
	static Scanner scan = new Scanner(System.in);
	private static int n, m;

	public static void main(String[] args) {
		System.out.println("Digite o número de variaveis do PPL: ");
		n = scan.nextInt();

		System.out.println("Digite o numero de restricoes do PPL: ");
		m = scan.nextInt();

		double[][] matrizA = { { 3, 3, 3 }, { 4, 5, 6 }, { 12, 23, 34 } };
		Matrix B = new Matrix(matrizA);
		double[] array = { 2, 3, 4 };
		B.print(4, 2);
		Matrix A = new Matrix(array, array.length).transpose().times(2).times(B);

		A.print(4, 2);
	}

	public static void setFuncaoCusto(Matrix C) {
		System.out.println("Digite os coeficientes da funcao custo: ");
		for (int i = 0; i < n; i++) {
			C.set(i, 0, scan.nextDouble());
		}
	}

	public static void setRestricoes(Matrix A, Matrix b) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n + m; j++) {
				System.out.print("Coeficiente " + (i + 1) + " da restricao " + (j + 1) + " da matriz A:");
				A.set(i, j, scan.nextDouble());
			}
			System.out.print("Elemento " + (i + 1) + " do vetor b: ");
			b.set(i, 0, scan.nextDouble());
		}
	}
	
	
}
