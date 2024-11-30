package com.anahuac.mayab.modulo2.sesion3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyAdapter;


public class AvanzadoEjemploHandeling {

	public static void main(String[] args) {
	
		//Crear el marco principal o ventana
		JFrame frame = new JFrame ("Ejemplo Avanzado de Listeners");
		frame.setDefaultCloseOperation(0);
		frame.setSize(600,600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		//crear un campo de texto
		JTextField campoTexto = new JTextField();
		campoTexto.setBounds(50,50,200,30);
		frame.add(campoTexto);
		
		//crear boton
		JButton boton = new JButton();
		boton.setBounds(270,50,100,30);
		frame.add(boton);
		
		//crear panel que cambie de color 
		
		JPanel panel= new JPanel();
		panel.setBounds(50,100,300,200);//
		frame.add(panel);
		
		//Crear una etiqueta para mostrar informacion del teclado
		
		JLabel etiquetaInformacion = new JLabel ();
		etiquetaInformacion.setBounds(50,320,400,30);//
		frame.add(etiquetaInformacion);
		
		//Agregar acciones de Listener
		boton.addActionListener(new ActionListener () {
			
			@Override
			public void actionPerformed (ActionEvent e) {
				String texto = campoTexto.getText() ;
				System.out.println("Texto Ingresado"+ texto);
				JOptionPane.showMessageDialog(frame, "Texto mandado"+ texto);
			}
		});
		
		//Agregar MouseListener
		panel.addMouseListener(new MouseAdapter () {
			@Override
			public void mouseClicked (MouseEvent e) {
				int x = e.getX();
				
				int y = e.getY();
				panel.setBackground(new Color ((int)(Math.random() * 0x1000000)));
				System.out.println ( "Panel clickeado en la posicion (" + x  + y + ")");
			}
		});
		
		
		//Agregar KeyListeners
		
		campoTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed (KeyEvent e) {
				int codigoTecla = e.getKeyCode();
				char caracterTecla = e.getKeyChar();
				etiquetaInformacion.setText("Tecla Presionada" +caracterTecla +"Codigo Tecla" +codigoTecla);
			
			if (codigoTecla == KeyEvent.VK_ENTER) {
				
				System.out.println("Salga presionando escape");
			}
				 else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
	                    // Cerrar la ventana si se presiona Escape
	                    frame.dispose(); // Cerrar la ventana
	                    
			}
			
				 else if (codigoTecla == KeyEvent.VK_KP_UP) {
					 JFrame window = new JFrame("Nueva Ventana");
						window.setSize (270,50);
						window.setVisible(true);
				 }
			}
			});
		
		
		//-----
		frame.setVisible(true);
		}
				
		}
	
