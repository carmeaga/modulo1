package com.anahuac.mayab.modulo1;

import java.util.Scanner;

public class calificacionesvalidacion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vamos a pedir al usuario calificaciones para promediar
		double sumacalificaciones; // aqui se pueden inicializar las variables y ahorrar pasos                        
		double calificacion;
		double promedio;
		int contador;
		
		sumacalificaciones =0;
		calificacion = 0;
		promedio = 0;
		contador = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribir una calificacion (-1 para salir)");
		calificacion =sc.nextDouble(); // lee entrada del teclado y no da enter no hace nada
		
		while (calificacion !=-1) {
			if (calificacion >= 5 && calificacion <=10) {
			sumacalificaciones = sumacalificaciones + calificacion;
			contador++;
			}
			else {
				System.out.println ("Escribir una calificacion valida (5-10)");
				//calificacion.sc.nextDouble();
			}
			System.out.println("Escribir una calificacion (-1 para salir");
			calificacion = sc.nextDouble();//lee entrada de teclado
		}
		promedio = sumacalificaciones / contador;
		System.out.println ("el promedio es " + promedio);
	}
}

