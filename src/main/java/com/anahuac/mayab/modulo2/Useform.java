package com.anahuac.mayab.modulo2;
import javax.swing.*;
import java.awt.*;

public class Useform extends JFrame {

    public Useform() {
        // Configuración del JFrame
        setTitle("Formulario de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar ventana en la pantalla

        // Configuración del panel principal con BorderLayout
        setLayout(new BorderLayout());

        // Panel para los campos de entrada
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 filas, 2 columnas
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Espaciado

        // Componentes del formulario
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Edad:");
        JTextField ageField = new JTextField();

        JLabel neighborhoodLabel = new JLabel("Colonia:");
        JTextField neighborhoodField = new JTextField();

        // Añadir componentes al panel
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);
        inputPanel.add(neighborhoodLabel);
        inputPanel.add(neighborhoodField);

        // Panel para el botón
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("Enviar");
        buttonPanel.add(submitButton);

        // Añadir paneles al JFrame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Hacer visible el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Useform::new);
    }
}
