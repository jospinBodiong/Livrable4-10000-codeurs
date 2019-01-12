package com.objis.cameroun.oklm1.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.objis.cameroun.oklm1.service.IService;
import com.objis.cameroun.oklm1.service.ServiceImpl;
import com.objis.cameroun.oklm1.domaine.Etudiant;
import com.objis.cameroun.oklm1.domaine.EtudiantModel;

public class ListReservations extends JFrame {

	private JPanel contentPane;
	private EtudiantModel etudiantModel;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public ListReservations() {
		setTitle("Liste de Reservations");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		//Appel de la couche service
		
				IService service = new ServiceImpl();
				
				//Appel de la methode ListEtudiants de  la couche service.
				List<Etudiant> etudiants;
				
				etudiants = service.listEtudiantsService();
				
				etudiantModel = new EtudiantModel (etudiants);
				  //Insertion des attributs de la variable Etudiant model dans la table.
		 table_1 = new JTable(etudiantModel);	
		table_1.setBounds(160, 105, 1, 1);
		//contentPane.add(table_1);
		JScrollPane scrollPane = new JScrollPane(table_1);
		//scrollPane.setBounds(0, 264, 435, -264);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
	}
}
