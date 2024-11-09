package com.anahuac.mayab.modulo1.sesion3;

public class Perro {
	//variables de instancia o atributos
	private String raza;
	private String tamanio;
	private double peso;
	private String nombre;
	private String nombreDuenio;
	private int edad;
	
	public Perro() {
		
	}
	
	public Perro(String tamanio, String nombre, String nombreDuenio, int edad) {
		super();
		this.tamanio = tamanio;
		this.nombre = nombre;
		this.nombreDuenio = nombreDuenio;
		this.edad = edad;
	}
	public Perro(String raza, String tamanio, double peso, String nombre, String nombreDuenio, int edad) {
		super();
		this.raza = raza;
		this.tamanio = tamanio;
		this.peso = peso;
		this.nombre = nombre;
		this.nombreDuenio = nombreDuenio;
		this.edad = edad;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreDuenio() {
		return nombreDuenio;
	}
	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodos / ¿Qué Hace?
	public void ladrar() {
		System.out.println ("Me llamo: " + this.nombre + " el dueño es: " + this.nombreDuenio + " Estoy ladrando gua gua");
	}
}
