package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {

	public static void main(String[] args) {
		
		Perro perro = new Perro ("unica", "firulais", "Christian");
		CartillaPerro cartilla = new CartillaPerro (perro, "123");
		Veterinaria vet = new Veterinaria ("Mi veterinaria");
		vet.agregarPaciente(cartilla);
		
		/*  --------------*/
		Perro perro2 = new Perro ("salchicha", "avena", "xime");
		CartillaPerro cartilla1 = new CartillaPerro (perro2, "456");
		Veterinaria vet1 = new Veterinaria ("Mi veterinaria");
		vet1.agregarPaciente(cartilla1);
		
		/*---------*/
		try {
		Servicio servicio = vet.crearServicio("baño", perro.getNombre(), "16/11/2024");
		servicio.realizar(perro.getNombre());
		Servicio servicio2 = vet.crearServicio("vacuna", perro.getNombre(), "21/11/2024");
		servicio2.setCartilla(cartilla);
		servicio2.realizar(perro.getNombre());
		/*----------------------------------------*/
		Servicio servicios3 = vet1.crearServicio("baño", perro2.getNombre(), "22/11/2024");
		servicios3.realizar(perro2.getNombre());
		Servicio servicio4 = vet1.crearServicio("vacuna", perro2.getNombre(), "23/11/2024");
		servicio4.setCartilla(cartilla1);
		servicio4.realizar(perro2.getNombre());
		/*------------------------------------------*/
		//Servicio servicios = vet.crearServicio("baño", perro2.getNombre(), "16/11/2024");
		cartilla.imprimirCartilla();
		cartilla1.imprimirCartilla();
		
		
	}catch (Exception e) {
		System.out.println("ese servcio no lo ofrecemos");
		e.printStackTrace();
	}
		//imprimir expedientes
	vet.imprimirExpedientes();
	vet1.imprimirExpedientes();
	}
}


