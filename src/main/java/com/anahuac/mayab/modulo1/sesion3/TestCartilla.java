package com.anahuac.mayab.modulo1.sesion3;

import java.io.IOException;

public class TestCartilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro miPerro = new Perro ("unica", "Firulais", 5, "Christian");
		CartillaPerro cartilla = new CartillaPerro();
		
		cartilla.setDatosPerro(miPerro);
		
		cartilla.actualizar("rabia","5-Marzo-2022");
		cartilla.actualizar("quintuple","5-Marzo-2022");
		cartilla.actualizar("sextuple","5-Marzo-2022");
		cartilla.actualizar("parvovirus","5-Marzo-2022");
		
		cartilla.imprimirCartilla();
		
			cartilla.imprimirExpediente();
		try {
			cartilla.imprimirExepcion();
		} catch (IOException e) {
			System.out.println ("No se pudo imprimir el archivo");
			e.printStackTrace();
		}

	}

}
