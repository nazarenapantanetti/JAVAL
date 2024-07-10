package ejercicios.clase02;
/*
 * Ejercicio01
Programa que muestra los N primeros numeros de la serie de Fibonacci. El valor de N se lee por teclado.

La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie es el numero 1. 
El segundo termino de la serie es el numero 1.
Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.print(num2); //Imprime 1 y arranca.
		  for (int i = 1; i < 7; ++i) {
	           int num3 = num1 + num2;
	            System.out.print(", " + num3);
	            num1 = num2;
	            num2 = num3;
		  }
	}
}
