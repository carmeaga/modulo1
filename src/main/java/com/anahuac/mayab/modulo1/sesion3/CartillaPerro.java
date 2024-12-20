package com.anahuac.mayab.modulo1.sesion3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
	//Atributos
	private Perro datosPerro;
	private String idCartilla;
	HashMap<String, ArrayList<String>> vacunas = new HashMap<>();
	
	//constructores
	public CartillaPerro() {
		
	}
	
	public CartillaPerro(Perro datosPerro, String idCartilla) {

		this.datosPerro = datosPerro;
		this.idCartilla = idCartilla;
	}
	
	//getters y setters
	public Perro getDatosPerro() {
		return datosPerro;
	}
	
	public void setDatosPerro(Perro datosPerro) {
		this.datosPerro = datosPerro;
	}
	public String getIdCartilla() {
		return idCartilla;
	}
	public void setIdCartilla(String idCartilla) {
		this.idCartilla = idCartilla;
	}
	public HashMap<String, ArrayList<String>> getVacunas() {
		return vacunas;
	}
	public void setVacunas(HashMap<String, ArrayList<String>> vacunas) {
		this.vacunas = vacunas;
	}
		
	public void actualizar(String nombreVacuna, String fechaAplicacion) {
		//Checar si la vacuna existe en la cartilla
		if (vacunas.containsKey(nombreVacuna)) {
			ArrayList<String> fechas = vacunas.get(nombreVacuna);
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		else { //NO existe
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaAplicacion);
			vacunas.put(nombreVacuna, fechas);
		}
		
	}
	public void imprimirCartilla () {
		System.out.println ("--------Datos Perro------");
		System.out.println (datosPerro.toString());
		System.out.println ("-------------------");
	   for (String vacuna : vacunas.keySet() ) {
		   System.out.println ("Vacunas : " + vacuna);
		   ArrayList <String> fechas = vacunas.get(vacuna);
		   for (String fecha : fechas) {
			   System.out.println ("Fecha: " + fecha);
		   }
		   System.out.println ("------------------");
		   
		   }
		   
	   
}
		public void imprimirExpediente() {
			String nombreArchivo = datosPerro.getNombre()+"txt";
			FileWriter archivo;
			try {
				 archivo = new FileWriter(nombreArchivo);
				 PrintWriter pw = new PrintWriter(archivo);
				 pw.println ("------Datos Perro------");
		            pw.println (datosPerro.toString());
		            pw.println("----------------");
			
	        for (String vacuna : vacunas.keySet()) {
	            	            
	            pw.println ("Vacuna : "+ vacuna) ;
	            ArrayList <String> fechas = vacunas.get(vacuna);
	            for (String fecha : fechas) {
	 			   System.out.println ("Fecha: " + fecha);
	 			   pw.println ("Fecha : " + fecha);
	 		   }
	            
	            pw.println ("-----------");
	        }
	        pw.close();
	        pw.println ("----------");
	        } catch (IOException e) {
	            System.out.println("No pude abrir el archivo");
	        	e.printStackTrace();
		}

		}
		public void imprimirExepcion() throws IOException {
			String nombreArchivo = "D:\\" +datosPerro.getNombre()+"txt";// se camnbio la direccion
			FileWriter archivo;
			//try {
				 archivo = new FileWriter(nombreArchivo);
				 PrintWriter pw = new PrintWriter(archivo);
				 pw.println ("------Datos Perro------");
		            pw.println (datosPerro.toString());
		            pw.println("----------------");
			
	        for (String vacuna : vacunas.keySet()) {
	            	            
	            pw.println ("Vacuna : "+ vacuna) ;
	            ArrayList <String> fechas = vacunas.get(vacuna);
	            for (String fecha : fechas) {
	 			   System.out.println ("Fecha: " + fecha);
	 			   pw.println ("Fecha : " + fecha);
	 		   }
	            
	            pw.println ("-----------");
	        }
	        pw.close();
	        pw.println ("----------");
	     /*   } catch (IOException e) {
	            System.out.println("No pude abrir el archivo");
	        	e.printStackTrace();
		}*/

		}
}

