package ejercicios.clase02;

import com.github.sanchezih.util.io.Consola;
/*
 * Ejercicio03
El programa leera por teclado un numero entero positivo y calculara la suma de sus cifras.
Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".
 */

public class Ejercicio03 {
	public static void main(String[] args) {
		int num = Consola.leerEntero("Ingrese un numero: ");
		int suma = 0;
		

		while (num > 0) {
			int cifra = num % 10;
			suma += cifra;
			num /= 10;
		}

		System.out.print("La suma de las cifras es: " + suma);
	}
}
