package com.anahuac.mayab.modulo2;
import javax.swing.*;
import java.awt.*;

public class BotonesVariantesEjemplos extends JFrame{
	
	public BotonesVariantesEjemplos () {
		setTitle ("Botones Variantes");
		setSize (400,300);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		
		//Configruacion de Panel Principal
		
		JPanel panel = new JPanel ();
		panel.setLayout(new BoxLayout (panel, BoxLayout.Y_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		//Configuración de boton
		
		JButton botonstandar = new JButton("Boton Estandar");
		botonstandar.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Boton con icono
		JButton botonicono = new JButton ("Boton con icono");
		botonicono.setIcon(new ImageIcon("C:\\Users\\Sis\\eclipse-workspace\\modulo1\\src\\main\\java\\com\\anahuac\\mayab\\modulo2\\imagenes\\global-search.png"));
		botonicono.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Boton Deshabilitado
		JButton botondeshabilitado = new JButton ("boton deshabilitado");
		botondeshabilitado.setEnabled (false);
		botondeshabilitado.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//boton dos estados
		JToggleButton botonTogle = new JToggleButton ("Boton dos estados");
		botonTogle.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//boton bordes personalizados
		
		JButton botonBordes = new JButton ("Boton bordes personalizados");
		botonBordes.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
		botonBordes.setBackground(Color.CYAN);
		botonBordes.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		//Añadir botones al panel
		
		panel.add(botonstandar);
		panel.add(Box.createRigidArea (new Dimension (0,10)));
		panel.add(botonicono);
		panel.add(Box.createRigidArea (new Dimension (0,15)));	
		panel.add(botondeshabilitado);
		panel.add(Box.createRigidArea (new Dimension (0,20)));
		panel.add( botonTogle);
		panel.add(Box.createRigidArea (new Dimension (0,25)));	
		panel.add( botonBordes);
		panel.add(Box.createRigidArea (new Dimension (0,30)));
		
		//añadir Panel al JFrame
		add(panel);
		setVisible (true);
		
	}

	public static void main(String[] args) {
		  SwingUtilities.invokeLater(BotonesVariantesEjemplos::new);

	}

}
