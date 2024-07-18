package ejercicios.clase04;

import com.github.sanchezih.util.io.Consola;

/**
 * Ejercicio01 Programa que pide el ingreso de un numero e indica si es un
 * numero primo o no.
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		int numero = Consola.leerEntero("Ingrese un numero: ");

		// Verificar si el número es primo
		if (numero > 1) {
			boolean esPrimo = true;
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false; // Si es divisible, no es primo
					break;
				}
			}
			System.out.print(esPrimo ? "El numero es primo" : "El numero no es primo");
		} else {
			System.out.print("El numero no es primo");
		}
	}
}