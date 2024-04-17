package util;

public abstract class Algoritmos {
	private int num;
	public Algoritmos (int num) {
		this.num = num;
	}
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static int fibonacci (int numero) {
		int fibonacci_1 = 0;
		int fibonacci_2 = 1;
		return 0;
	}
	
	public static int factorial (int numero) {
		int factorial = 0;
		for (int i = 0; i < numero; i++) {
			factorial += i * numero;
		}
		return factorial;
	}
	
	public static String esPrimo(int numero) {
		boolean esPrimo = true;
		for (int i = 2; i < numero; i++) {
			if(numero%i == 0 ) {
				esPrimo = false;
			} 
		}
		if (esPrimo == false) {
			return "El numero no es primo";
		}else {
			return "El numero es primo";
		}
	}
	
}
