package ejercicios.clase03;

import com.github.sanchezih.util.io.Consola;

/* Programa que lee la altura de N personas y calcula:
La altura media.
Cuantas personas tienen una altura superior a la media.
Cuantas tienen una altura inferior a la media.
 
El valor de N se pide por teclado y debe ser entero positivo.
 */
public class Ejercicio01 {
	public static void main(String[] args) {
		int numPersonas, superiorMedia = 0, inferiorMedia = 0;
		double sumAlturas = 0, media = 0;

		do {
			System.out.print("Introduce el numero de personas: ");
			numPersonas = Consola.leerEntero();
			if (numPersonas <= 0) {
				System.out.println("El numero debe ser un entero positivo. Intenta de nuevo.");
			}
		} while (numPersonas <= 0);

		double[] alturas = new double[numPersonas];

		for (int i = 0; i < numPersonas; i++) {
			System.out.print("Ingrese altura de la persona " + (i + 1) + ": ");
			alturas[i] = Consola.leerDouble();
			sumAlturas += alturas[i];
		}
		media = sumAlturas / numPersonas;
		for (double altura : alturas) {
			if (altura > media) {
				superiorMedia++;
			} else if (altura < media) {
				inferiorMedia++;
			}

		}
		System.out.printf("Altura media: %.2f metros\n", media);
		System.out.println("Personas con altura superior a la media: " + superiorMedia);
		System.out.println("Personas con altura inferior a la media: " + inferiorMedia);
	}
}
