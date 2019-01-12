package com.objis.cameroun.oklm1.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PAGEOKLM extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PAGEOKLM frame = new PAGEOKLM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//Fenetre principal de l'application Interface associant plusieurs pages.
	public PAGEOKLM() {
		setTitle("Bienvenue dans ton apps Detente");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmListReservations = new JMenuItem("List rerservations");
		mntmListReservations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListReservations frame = new ListReservations();
				frame.setVisible(true);
			}
		});
		mntmListReservations.setSelectedIcon(new ImageIcon("C:\\Users\\fabrice bodiongson\\Pictures\\2017-09\\PhotoGrid_1505508823353.jpg"));
		mntmListReservations.setForeground(Color.BLACK);
		mnNewMenu.add(mntmListReservations);
		
		JMenuItem mntmInscription = new JMenuItem("Inscription");
		mntmInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EnregistrerCommandes frame = new EnregistrerCommandes();
				frame.setVisible(true);
			}
		});
		mnNewMenu.add(mntmInscription);
		
		JMenu mnNewMenu_1 = new JMenu("commandes");
		mnNewMenu_1.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Obtenir la carte");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Programmescinema frame = new Programmescinema();
				frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmEnregistrercommandes = new JMenuItem("Enregistrer Commandes");
		mntmEnregistrercommandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnNewMenu_1.add(mntmEnregistrercommandes);
		
		JMenuItem mntmSupprimerReservations = new JMenuItem("Supprimer reservations");
		mnNewMenu_1.add(mntmSupprimerReservations);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-25, -129, 826, 466);
		contentPane.add(lblNewLabel);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\fabrice bodiongson\\Pictures\\2017-08\\Clarisse 20170825_104907.jpg"));
	}
}
