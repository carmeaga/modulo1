package com.anahuac.mayab.modulo1.sesion5;

import java.io.FileWriter;
import java.io.PrintWriter;
public class TestArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreArchivo = "C:\\miClase\\prueba.txt";
		try (FileWriter archivo = new FileWriter(nombreArchivo))
        {
            PrintWriter pw = new PrintWriter(archivo);
            pw.print ("Hola, bienvenido al diplomado de programación!\n");
            pw.print ("\nen JAva");
            pw.print ("\nesta en otra linea");
        } catch (Exception e) {
            System.out.println("No pude abrir el archivo");
        	e.printStackTrace();
        }
	}

}
