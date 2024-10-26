package com.anahuac.mayab.modulo1;

public class Calcular_propina {
// Calcular propina
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cuenta = 90;
		double propina = 10;
		if (cuenta > 100)
			propina = cuenta * .10;
		System.out.println ("La Propina es:" + propina);
		
	 }
}


