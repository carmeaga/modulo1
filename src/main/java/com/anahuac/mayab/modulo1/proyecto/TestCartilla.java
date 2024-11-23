package com.anahuac.mayab.modulo1.proyecto;

import java.io.IOException;

public class TestCartilla {

	public static void main(String[] args) throws IOException {
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
		cartilla.imprimirExepcion();
//----------------------------------
		
	/*	Perro miPerro2 = new Perro ("salchicha", "avena", 10, "Xime");
		CartillaPerro cartilla2 = new CartillaPerro();
		
		cartilla2.setDatosPerro(miPerro2);
		
		cartilla2.actualizar("rabia","5-Marzo-2022");
		cartilla2.actualizar("quintuple","5-Marzo-2022");
		cartilla2.actualizar("sextuple","5-Marzo-2022");
		cartilla2.actualizar("parvovirus","5-Marzo-2022");
		
		//cartilla.imprimirCartilla();
		cartilla2.imprimirCartilla();
			//cartilla.imprimirExpediente();
			cartilla2.imprimirExpediente();
			
		//cartilla.imprimirExepcion();
		cartilla2.imprimirExepcion();*/
	}

}
