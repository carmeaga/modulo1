package com.anahuac.mayab.modulo1;

public class arreglos {
	
	public static void main(String[] args)
	{
		int [] numbers = {10,20,30,40,50} ;//arreglo de enteros
		System.out.println ("Element at index 0:" + numbers[0]);
		System.out.println ("Element at index 2:" + numbers[2]);
		System.out.println ("Element at index 4:" + numbers[4]);
		
		int suma =0;
		
		for (int i=0; i < numbers.length; i++ ) //length atributo que indica el tamaño
		{
			suma+=numbers[i]; //suma = suma + numbers[i]
			
			
		}
		System.out.println ("La suma de los enteros es " +suma);
		numbers[3]=150;
		System.out.println ("La posicion 3 es: " +numbers[3]);
	}
}
