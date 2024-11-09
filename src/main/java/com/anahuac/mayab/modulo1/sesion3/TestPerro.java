package com.anahuac.mayab.modulo1.sesion3;

public class TestPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro1 = new Perro();
		
		Perro perro2 = new Perro("desconocida","pequeño", 10.5, "firulais", "pepe", 2);
		System.out.println ("El perro se llama "+perro1.getNombre());
		
		System.out.println ("El perro se llama "+perro2.getNombre());
		System.out.println("El dueño es " +perro2.getNombreDuenio());
		System.out.println ("la raza es "+perro2.getRaza()) ;
		perro1.setNombre("Solovino");
		perro1.setNombreDuenio("Christian");
		System.out.println ("El Perro se llama " +perro1.getNombre());
		System.out.println ("El dueño se llama" +perro1.getNombreDuenio());
		//public void 
		System.out.println ("el perro ladra " );
		perro1.ladrar();

				
	}
}


