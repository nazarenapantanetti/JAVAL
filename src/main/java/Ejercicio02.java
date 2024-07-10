package com.github.sanchezih.java_inicial.clase01._02_ejercitacion;

import ar.edu.ort.p1.util.Consola;

/***

EJERCICIO 02
Programa que pide por teclado la fecha de nacimiento de una persona (dia, mes, anio) y calcula su numero de la suerte.
El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
Numero de la suerte: 28

 */
 
public class Ejercicio02 {
	
	public static void main(String[] args) {
		int dia = Consola.leerEntero("Ingrese un numero:");
		int mes = Consola.leerEntero("Ingrese un numero:");
		int anio = Consola.leerEntero("Ingrese un numero:");
		int suma = (dia + mes + anio);
		String sumaComoCadena = String.valueOf(suma);
		System.out.println(sumaComoCadena);
		int numSuerte = 0;
		for (int i=0; i < sumaComoCadena.length(); i++) {
			int digito = Character.getNumericValue(sumaComoCadena.charAt(i));
			numSuerte += digito;
		} 	

		System.out.println(numSuerte);
		}
		}