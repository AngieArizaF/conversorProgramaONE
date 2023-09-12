package gui;

import javax.swing.*;

import conversor.Moneda;
import conversor.Unidad;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Font;

public class Ventanamain {

	public static void main(String[] args) {
		
		ArrayList<Moneda> moneda = new ArrayList<Moneda>();
	
		Moneda peso  = new Moneda("Peso Colombiano", "COP", 1.0);
		Moneda dolar = new Moneda("Dólares", "USD", 3989.25);
		Moneda euro  = new Moneda("Euros", "EUR", 4288.24);
		Moneda libra = new Moneda("Libras Esterlinas", "GBP", 4991.36);
		Moneda yen 	 = new Moneda("Yen Japonés", "JPY", 27.22);
		Moneda won 	 = new Moneda("Won sur-coreano", "KRW", 3.01);
		
		moneda.add(peso);
		moneda.add(dolar);
		moneda.add(euro);
		moneda.add(libra);
		moneda.add(yen);
		moneda.add(won);
		
		
		
		JFrame pantalla =new JFrame("Conversor - Programa ONE"); 
		pantalla.getContentPane().setLayout(null); // posicionamiento absoluto

		
		JLabel tituloP = new JLabel("Conversor");
		tituloP.setFont(new Font("Dialog", Font.BOLD, 16));
		tituloP.setBounds(46, 27, 95, 30);
		pantalla.getContentPane().add(tituloP);
		
		JComboBox<Unidad> comboBoxConversion = new JComboBox<Unidad>();
		comboBoxConversion.setBounds(145, 30, 95, 25);
		comboBoxConversion.addItem(dolar);
		pantalla.getContentPane().add(comboBoxConversion);
		
		
		
		JLabel lblUnidad1 = new JLabel("Unidad");
		lblUnidad1.setBounds(25, 95, 60, 17);
		pantalla.getContentPane().add(lblUnidad1);
		
		JTextField inputValor = new JTextField();
		inputValor.setHorizontalAlignment(SwingConstants.TRAILING);
		inputValor.setBounds(25, 115, 190, 30);
		pantalla.getContentPane().add(inputValor);
		
		JComboBox comboBoxUnidad1 = new JComboBox();
		comboBoxUnidad1.setBounds(225, 115, 60, 25);
		comboBoxUnidad1.addItem("Item1");
		comboBoxUnidad1.addItem("Item1");
		pantalla.getContentPane().add(comboBoxUnidad1);
		
		
		
		JLabel lblUnidad2 = new JLabel("Unidad");
		lblUnidad2.setBounds(25, 165, 60, 17);
		pantalla.getContentPane().add(lblUnidad2);
		
		JTextField outputValor = new JTextField();
		outputValor.setHorizontalAlignment(SwingConstants.TRAILING);
		outputValor.setBounds(25, 185, 190, 30);
		pantalla.getContentPane().add(outputValor);
		
		JComboBox comboBoxUnidad2 = new JComboBox();
		comboBoxUnidad2.setBounds(225, 185, 60, 25);
		comboBoxUnidad2.addItem("Item1");
		comboBoxUnidad2.addItem("Item1");
		pantalla.getContentPane().add(comboBoxUnidad2);
		
		JLabel lblHbjb = new JLabel("");
		lblHbjb.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHbjb.setBackground(new Color(255, 255, 255));
		lblHbjb.setBounds(25, 227, 60, 17);
		pantalla.getContentPane().add(lblHbjb);
		
		
		
        pantalla.setBounds(200,200,320,400);
        pantalla.setVisible(true);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
