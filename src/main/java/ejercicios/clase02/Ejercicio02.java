package ejercicios.clase02;

import com.github.sanchezih.util.io.Consola;
/*
 * Ejercicio02
Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B son numeros amigos si la suma de 
los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
Los divisores propios de un número incluyen la unidad pero no el propio numero.
Un ejemplo de numeros amigos son los numeros 220 y 284.
Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
La suma de los divisores propios de 220 da como resultado 284
Los divisores propios de 284 son 1, 2, 4, 71 y 142.
La suma de los divisores propios de 284 da como resultado 220.
Por lo tanto 220 y 284 son amigos.

Otras parejas de numeros amigos son:
1184, 1210
2620, 2924
5020, 5564
6232, 6368
10744, 10856
12285, 14595
17296, 18416
 */

public class Ejercicio02 {
	
	public static void main(String[] args) {
		int num1 = Consola.leerEntero("Ingrese un numero: ");
		int num2 = Consola.leerEntero("Ingrese un numero: ");
		int divisoresA = 0;
		int divisoresB = 0;
		
		 for(int i = 1 ; i < num1 ; i++){
		        if(num1 % i ==0){
		         divisoresA = divisoresA + i;
		        }
		    }
		 System.out.println("La suma de los divisores de " + num1 +" es: " + divisoresA); 
		 for(int i = 1 ; i < num2 ; i++){
		        if(num2 % i==0){
		         divisoresB = divisoresB + i;
		        }
		    }
		 System.out.println("La suma de los divisores de " + num2 +" es: " + divisoresB);

		if (divisoresA == num2 & divisoresB == num1) {
			System.out.println("los numeros son amigos");
		} else {
			System.out.println("los numeros no son amigos");
		}
	}
}