package util;

public abstract class Algoritmos {
	private int num;
	public Algoritmos (int num) {
		this.num = num;
	}
	/**
	 * Este metodo calcula el numero dentro de la secuencia de fibonacci 
	 * correspondiente al numero que se le pase por parametro
	 * @param el numero del que se quiere saber su correspondiente en fibonacci
	 * @return el numero dentro de la secuencia de fibonacci correspondiente al pasado por parametro
	 */
	public static int fibonacci (int numero) {
		
		if (numero <=1) {
			return numero;
		} else {
			return  fibonacci(numero - 1) + fibonacci(numero - 2); 
			
		}
		 
	}
	/**
	 * Este metodo realiza el factorial del numero que se le pase por parametro
	 * @param el numero del que se quiere realizar el factorial
	 * @return el factorial del numero pasado por pantalla
	 */
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
