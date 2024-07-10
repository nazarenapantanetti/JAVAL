package ejercicios.clase01;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o
 * de 3.
 * 
 * 
 * @author ihsanch
 *
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		int num1 = Consola.leerEntero("Ingrese un numero:");
		if (num1 % 2 == 0) {
			System.out.println("el numero es multiplo de 2");
		} else if (num1 % 3 == 0) {
			System.out.println("el numero es multiplo de 3");
		} else System.out.println("el numero no es multiplo de 2 ni de 3");
	}
}