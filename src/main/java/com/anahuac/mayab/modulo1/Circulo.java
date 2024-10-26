package com.anahuac.mayab.modulo1;

import java.time.LocalDate;

public class Circulo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub 
	//	double area, diametro, circunferencia;
	//	double radio = 10;
	//	area = (radio * radio ) * 3.1416;
	//	diametro = 2 * radio;
	//	circunferencia = 3.14 * diametro; 
		
	//	System.out.println ("el area es:"+ area);
	//	System.out.println ("el diametros es:"+ diametro);
	//	System.out.println ("el cirucunferencia es:"+ circunferencia);
	//	System.out.println ("el radio es:" + radio);
	                  
//	}

//}
// agregar librerias
/*public static void main(String[] args) {
	// TODO Auto-generated method stub 
	double area, diametro, circunferencia;
	double radio = 5;
	area = Math.pow (radio , 2 ) * Math.PI;
	diametro = 2 * radio;
	circunferencia = 3.14 * diametro; 
	
	System.out.println ("el area es:"+ area);
	System.out.println ("el diametros es:"+ diametro);
	System.out.println ("el cirucunferencia es:"+ circunferencia);
	System.out.println ("el radio es:" + radio);
	LocalDate.now();
                  
}

}*/
// Agregar funciones
	public static double calcularArea (double radio)  {
		area = Math.pow (radio , 2 ) * Math.PI;
		return area;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub 
	double area, diametro, circunferencia;
	double radio = 5;
	area = Math.pow (radio , 2 ) * Math.PI;
	diametro = 2 * radio;
	circunferencia = 3.14 * diametro; 
	
	System.out.println ("el area es:"+ area);
	System.out.println ("el diametros es:"+ diametro);
	System.out.println ("el cirucunferencia es:"+ circunferencia);
	System.out.println ("el radio es:" + radio);
	LocalDate.now();
                  
}

}
