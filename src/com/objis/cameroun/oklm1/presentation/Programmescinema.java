package com.objis.cameroun.oklm1.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Programmescinema extends JFrame {

	private JPanel contentPane;
	private JTextField txthhh;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	//Classe qui genere le programme de film en semaine.
	public Programmescinema() {
		setTitle("Programme semaine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\fabrice bodiongson\\Pictures\\IMG-20190104-WA0000 (1).jpg"));
		contentPane.add(lblNewLabel, BorderLayout.EAST);
		
		JTextArea txtrLundiMardiMercredi = new JTextArea();
		txtrLundiMardiMercredi.setForeground(Color.RED);
		txtrLundiMardiMercredi.setColumns(7);
		txtrLundiMardiMercredi.setText("LUNDI  MARDI  MERCREDI   JEUDI   VENDREDI   SAMEDI   DIMANCHE ");
		contentPane.add(txtrLundiMardiMercredi, BorderLayout.NORTH);
		
		txthhh = new JTextField();
		txthhh.setText("13H                                                          16H       19H   ");
		contentPane.add(txthhh, BorderLayout.SOUTH);
		txthhh.setColumns(10);
	}

}
