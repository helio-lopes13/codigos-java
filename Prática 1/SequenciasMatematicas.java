public class SequenciasMatematicas {
	
	static void fatorial() {
		for (int i = 1; i <= 10; i++) {
			int resultado = 1;
			for (int j = 1; j <= i; j++) {
				resultado *= j;
			}
			System.out.println(i + "! = " + resultado);
		}
	}
	
	static void serieHarmonica(int n) {
		double resultado = 0;
		for (int i = 1; i <= n; i++) {
			resultado += 1.0/i;
			System.out.println(resultado);
		}
	}
	
	static void sequenciaX(int x) {
		int y;
		while (x > 1) {
			if (x % 2 == 0) y = x / 2;
			else y = (x * 3) + 1;
			if (y == 1) {
				System.out.println(y + ".");
				break;
			}
			System.out.print(y + " -> ");
			x = y;
		}
	}
	
	static void piramidePotencia (int n) {
		for (int i = 1; i <= n; i++) {
			int resultado = 1;
			for (int j = 1; j <= i; j++) {
				resultado *= i;
				System.out.print(resultado + " ");
			}
			System.out.println();
		}
	}
}
