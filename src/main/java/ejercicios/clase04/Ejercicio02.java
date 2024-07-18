package ejercicios.clase04;
import java.util.Arrays;
import java.util.Random;
/**
 * Ejercicio02 Programa que genera un array de 8 enteros aleatorios entre 1 y
 * 10, lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo
 * muestra.
 */

public class Ejercicio02 {
	public static void main(String[] args) {

		int[] array = arrayGenerator();
		System.out.print("Array original: " +  Arrays.toString(array));

		int[] sortedArray = bubbleSort(array);
		System.out.print("Array ordenado: " + Arrays.toString(sortedArray));
	}

	public static int[] arrayGenerator() {

		int[] array = new int[8];
		// lleno array con numeros aleatorios
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10) + 1;
		}
		return array;
	}

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}
}
