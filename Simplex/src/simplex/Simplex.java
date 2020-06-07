package simplex;

import java.util.Scanner;

import Jama.Matrix;

public class Simplex {
	private static Scanner scan = new Scanner(System.in);
	private static int n, m;
	private static Matrix x, A, b, B, Ct, CReduzido;
	private static int[] indicesBase;
	
	public static void main(String[] args) {
		System.out.print("Digite o número de variaveis do PPL: ");
		n = scan.nextInt();

		System.out.print("Digite o numero de restricoes do PPL: ");
		m = scan.nextInt();

		setFuncaoCusto();
		setRestricoes();
		inicializarIndicesBase();
		setMatrizBase();
		inicializarX();
		
		x.print(4, 2);
		A.print(4, 2);
		b.print(4, 2);
		B.print(4, 2);
		Ct.print(4, 2);
		
		CReduzido = Ct.minus(getCTB().times(B.inverse()).times(A));
		
		CReduzido.print(4, 2);

		while (true) {
			
		}
	}

	public static void setMatrizBase() {
		B = new Matrix(m, m);
		for (int i = 0; i < indicesBase.length; i++) {
			for (int j = 0; j < indicesBase.length; j++) {
				B.set(i, j, A.get(i, indicesBase[j]));
			}
		}
	}

	public static void inicializarIndicesBase() {
		indicesBase = new int[m];
		for (int i = 0; i < indicesBase.length; i++) {
			indicesBase[i] = n + i;
		}
	}

	public static void setFuncaoCusto() {
		Ct = new Matrix(1, n + m);
		System.out.print("Digite os coeficientes da funcao custo: ");
		for (int i = 0; i < n; i++) {
			Ct.set(0, i, scan.nextDouble());
		}
	}

	public static void setRestricoes() {
		A = new Matrix(m, n + m);
		b = new Matrix(m, 1);
		for (int i = 0; i < m; i++) {
			System.out.print("Digite a restricao " + (i + 1) + ": ");
			for (int j = 0; j < n + m; j++) {
				A.set(i, j, scan.nextDouble());
			}
			b.set(i, 0, scan.nextDouble());
		}
	}

	public static void inicializarX() {
		x = new Matrix(n + m, 1);
		Matrix xB = B.inverse().times(b);
		for (int i = 0; i < indicesBase.length; i++) {
			x.set(indicesBase[i], 0, xB.get(i, 0));
		}
	}

	public static double[] getXB() {
		double[] xB = new double[m];
		for (int i = 0; i < indicesBase.length; i++) {
			xB[i] = x.get(indicesBase[i], 0);
		}
		return xB;
	}

	public static Matrix getCTB() {
		Matrix cB = new Matrix(1, m);
		for (int i = 0; i < indicesBase.length; i++) {
			cB.set(0, i, Ct.get(0, indicesBase[i]));
		}
		return cB;
	}
	
	public static int verificarCReduzido() {
		for(int i = 0; i < CReduzido.getColumnDimension(); i++) {
			if (CReduzido.get(0, i) < 0)
				return i;
		}
		return -1;
	}
}
