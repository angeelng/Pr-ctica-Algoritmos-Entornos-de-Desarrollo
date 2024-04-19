package util;
/**
 * Clase Algoritmos. Permite calcular diferentes algoritmos
 * @author Ángel 
 */
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
	/**
	 * Este metodo recibe un numero y verifica si es primo o no
	 * @param el numero del que se quiere saber si es primo o no
	 * @return un booleano en funcion de si el numero recibido es primo o no
	 */
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		if (numero < 2) {
			return false;
		}
		for (int i = 2; i < numero; i++) {
			if(numero%i == 0 ) {
				esPrimo = false;
				return false;
			} 
		}
		return true;
	}
	
}
