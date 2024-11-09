package com.anahuac.mayab.modulo1.sesion3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;
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

		//crear un arreglo de 10 perros
		//con nombres aletorios
		
		Perro [] misPerros = new Perro [10];
		String []duenos = {"humano1","humano2","humano3","humano4","humano5","humano6","humano7","humano8","humano9","humano10"};
		String[] nombres = {"Perro1" ,"Perro2","Perro3","Perro4","Perro5","Perro6","Perro7","Perro8","Perro9","Perro10",};
		for( int i =0; i < 10; i++) {
			misPerros [i] = new Perro ();
			misPerros[i].setNombre(nombres[i]);
		}
		for( int i =0; i < 10; i++) {
			misPerros[i].ladrar();
		}
		Random randomGenerator = new Random();
		for( int i =0; i < 10; i++) {
			int aleatorio = randomGenerator.nextInt(10);
				misPerros[i].setNombreDuenio(duenos[aleatorio]);
				misPerros[i].ladrar();
			}
		
		System.out.println ("Usando ArrayList");
		
		//ahora agregmamos un arraylist
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		for( int i =0; i < 10; i++) {
			Perro perroTemporal = new Perro();//variable teporal
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = randomGenerator.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenos [numeroAleatorio]);
			listaPerros.add(perroTemporal);
			
		}
		for( int i =0; i < 10; i++) {
			listaPerros.get(i).ladrar();
		}
		//busqueda de perro
		for (int i = 0; i< listaPerros.size(); i++) {
			String nombre=listaPerros.get(i).getNombre();
			if (nombre == "perro6") {
				listaPerros.get(i).setNombre("nuevo nombre del perro");
				break;
			}
		}
		System.out.print ("DEspues de cambiar el nombre");
		for( int i =0; i < 10; i++) {
			listaPerros.get(i).ladrar();}
		
		System.out.println ("-----For each");
		for (Perro perro : listaPerros){
			perro.ladrar ();
		}
		System.out.println ("-----usando un hashmap");
		HashMap<Integer,Perro> mapPerros = new HashMap<>();
		for( int i =0; i < 10; i++) {
			Perro perroTemporal = new Perro();//variable teporal
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = randomGenerator.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenos [numeroAleatorio]);
			listaPerros.add(perroTemporal);
			mapPerros.put(i, perroTemporal);
			
		}
		System.out.println ("________Usando un HashMap con Keyset ");
		for (Integer ii: mapPerros.keySet()) {
			mapPerros.get(ii).ladrar();
		}
		System.out.println ("________Usando un HashMap con entryset ");
		for (Entry<Integer, Perro> entry : mapPerros.entrySet()) {
			entry.getValue().ladrar();
		}
		System.out.println ("________Usando un HashMap con Values ");
		for (Perro p:mapPerros.values()) {
			p.ladrar();
		}
	}
}


