package ejercicios.clase03;

import com.github.sanchezih.util.io.Consola;

/*Programa que pide 10 numeros por teclado, los almacena en un array y que luego muestra
 * el maximo valor, el minimo y las posiciones que ocupan en el array.
 */
public class Ejercicio02 {
	public static void main(String[] args) {
		int ubicacionMax = 0, ubicacionMin = 0;
		System.out.print("Ingrese 10 num: ");
		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el número " + (i + 1) + ": ");
			numeros[i] = Consola.leerEntero();
		}
		// Identifico valor maximo
		int max = numeros[0];
		for (int i = 1; i < 10; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}
		// Identifico ubicacion valor maximo
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == max) {
				ubicacionMax = i;
			}
		}
		System.out.println("El maximo vallor es " + max + " cuya ubicacion es " + ubicacionMax);

		// Identifico valor minimo
		int min = numeros[0];
		for (int i = 1; i < 10; i++) {
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		// Identifico ubicacion valor minimo
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == min) {
				ubicacionMin = i;
			}
		}
		System.out.println("El maximo vallor es " + min + " cuya ubicacion es " + ubicacionMin);
	}
}
