package ejercicios.clase03;

import com.github.sanchezih.util.io.Consola;

/*
 * Programa que pide 5 numeros enteros, los almacena en un array,
 * e indica por pantalla si dicho array es capicua.
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = Consola.leerEntero();
		}

		boolean esCapicua = true;
		for (int i = 0; i < numeros.length / 2; i++) {
			if (numeros[i] != numeros[numeros.length - 1 - i]) {
				esCapicua = false;
				break;
			}
		}

		if (esCapicua) {
			System.out.print("El arreglo es capicua");
		} else {
			System.out.print("El arreglo no es capicua");
		}

	}

}
