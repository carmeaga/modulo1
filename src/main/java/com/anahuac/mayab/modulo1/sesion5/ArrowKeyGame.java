package com.anahuac.mayab.modulo1.sesion5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class ArrowKeyGame extends JFrame {

	private JPanel player;

	private final int STEP = 40; // Tamaño del movimiento

	public ArrowKeyGame() {

		setTitle("Juego con Flechas");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null); // Diseño libre para mover el objeto
// Crear el objeto del jugador
		player = new JPanel();
		player.setBackground(Color.CYAN);
		player.setBounds(180, 180, 40, 40); // Tamaño inicial y posición
		add(player);
// Añadir KeyListener al JFrame
		addKeyListener(new KeyListener() {
			
			@Override
	public void keyPressed(KeyEvent e) {
// Mover el objeto según la tecla presionada
	switch (e.getKeyCode()) {
	case KeyEvent.VK_UP -> movePlayer(0, -STEP);
	case KeyEvent.VK_DOWN -> movePlayer(0, STEP);
	case KeyEvent.VK_LEFT -> movePlayer(-STEP, 0);
	case KeyEvent.VK_RIGHT -> movePlayer(STEP, 0);
	}
	}
	@Override
	public void keyTyped(KeyEvent e) {
// Este método no se utiliza en este ejemplo
	}
	@Override
	public void keyReleased(KeyEvent e) {
// Este método no se utiliza en este ejemplo
	}
		});
		setFocusable(true); // Permitir que el JFrame reciba eventos de teclado
		setVisible(true);
	}
// Método para mover al jugador
	private void movePlayer(int dx, int dy) {
		int x = player.getX() + dx;
		int y = player.getY() + dy;
// Limitar el movimiento dentro de la ventana
		if (x >= 0 && x + player.getWidth() <= getWidth() -STEP &&
			y >= 0 && y + player.getHeight() <= getHeight()-STEP) {
			player.setLocation(x, y);
}
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(ArrowKeyGame::new);
}
}