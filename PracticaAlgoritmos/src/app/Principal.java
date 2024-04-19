package app;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Crea mediante un bucle un array de enteros llamado “numeros” con 5 numeros aleatorios del 1 al 10.
		 * Calcula mediante un bucle el número de fibonacci de los 5 números del array y almacena 
		 * el resultado en otro array de enteros llamado “resultadoFibonacci”.
		 */
		int resultadoFibonacci [] = new int [5];
		int numeros [] = new int [5];
		int numRandom;
		for (int i = 0; i < 5; i++) {
			numRandom = (int)(Math.random() * (10 + 1));	
			numeros[i] = numRandom;
		}
		for (int i = 0; i < 5; i++) {			
			resultadoFibonacci [i] = util.Algoritmos.fibonacci(numeros[i]);
		}
		
		/**
		 * Calcula mediante un bucle el factorial de los 5 números del array y almacena el resultado en otro array de enteros llamado “resultadoFactorial”.
		 */
		int resultadoFactorial [] = new int [5];
		for (int i = 0; i < 5; i++) {
			resultadoFactorial [i] = util.Algoritmos.factorial(numeros[i]);			
		}
		/**
		 * Comprueba mediante un bucle si los 5 números del array son primos o no y almacena el resultado en otro array de booleanos llamado “resultadoPrimos”.
		 */
		boolean resultadoPrimos [] = new boolean [5];
		for (int i = 0; i < 5; i++) {
			resultadoPrimos[i] = util.Algoritmos.esPrimo(numeros[i]);			
		}
	}

}
