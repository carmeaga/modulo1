package com.anahuac.mayab.modulo1;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n = 100;
	int suma = 0;
	int contador = 1;
	while (contador <= n) {
		suma = suma + contador;
		contador = contador + 1;
		// otra forma es contador++;
	}
	System.out.println ("La suma es:"+ suma);
  }

}
