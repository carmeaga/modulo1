package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 18;
		boolean ine = false;

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			if(ine == true){
				System.out.println ("ya puedes votar");
			}
			else {
			System.out.println ("Acude a tu moludo");
			}
		}
		else {
		System.out.println ("No eres mayor de edad");
		}

	}
}