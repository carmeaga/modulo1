package com.anahuac.mayab.modulo2;

import javax.swing.*;
import java.awt.*;

public class GridModificado extends JFrame {
	
	public GridModificado () {
		setTitle ("GridModificado Ejemplo");
		setSize (400, 200);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		//Configurar en gridLayout
		
		setLayout(new GridLayout (3, 3, 10, 10 )); 
		
		//añadircomponentes
		
		add (new JLabel ("Hola"));//        JLabel nameLabel = new JLabel("Nombre:");
		add (new JLabel ("2"));
		add (new JLabel ("3"));
		add (new JTextField ("4"));
		add (new JTextField ("5"));
		add (new JTextField ("6"));
		add (new JButton ("7"));
		add (new JButton ("Aceptar"));//boton5= new JButton ("COTANGENTE");
		add (new JButton ("9"));
		//add (new JButton ("10"));
		//add (new JButton ("11"));
		//add (new JButton ("12"));
		//add (new JButton ("13"));
		//add (new JButton ("14"));
		//add (new JButton ("15"));
		
		setVisible(true);
			
	}
	public static void main (String[] args) {
	SwingUtilities.invokeLater(GridModificado::new);
}
}