package com.objis.cameroun.oklm1.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.oklm1.domaine.Etudiant;
import com.objis.cameroun.oklm1.service.IService;
import com.objis.cameroun.oklm1.service.ServiceImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class EnregistrerCommandes extends JFrame {

	private JPanel contentPane;
	private JTextField nomsTextField;
	private JTextField prenomsTextField;
	private JTextField matriculeTextField;
	private JTextField telephoneTextField;
	private JTextField filmreservésTextField_1;
	private JTextField nbreplacesTextField_2;
	private JTextField dateTextField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	//Classe conttenant les boutons et attributs servantt  resrver les des films ett a s'inscrire dans la BD.
	public EnregistrerCommandes() {
		setTitle("Enregistrer commandes");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNoms = new JLabel("Noms:");
		lblNoms.setBounds(0, 11, 46, 14);
		contentPane.add(lblNoms);
		
		nomsTextField = new JTextField();
		nomsTextField.setBounds(56, 8, 175, 20);
		contentPane.add(nomsTextField);
		nomsTextField.setColumns(10);
		
		JLabel lblPrenoms = new JLabel("Prenoms:");
		lblPrenoms.setBounds(0, 43, 46, 14);
		contentPane.add(lblPrenoms);
		
		prenomsTextField = new JTextField();
		prenomsTextField.setBounds(56, 40, 175, 20);
		contentPane.add(prenomsTextField);
		prenomsTextField.setColumns(10);
		
		JLabel lblMatricule = new JLabel("Matricule:");
		lblMatricule.setBounds(0, 71, 46, 14);
		contentPane.add(lblMatricule);
		
		matriculeTextField = new JTextField();
		matriculeTextField.setBounds(56, 71, 175, 20);
		contentPane.add(matriculeTextField);
		matriculeTextField.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telephone:");
		lblTelephone.setBounds(0, 105, 46, 14);
		contentPane.add(lblTelephone);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setBounds(55, 102, 176, 20);
		contentPane.add(telephoneTextField);
		telephoneTextField.setColumns(10);
		
		JLabel lblFilmreservés = new JLabel("Filmreserv\u00E9s:");
		lblFilmreservés.setBounds(0, 140, 46, 14);
		contentPane.add(lblFilmreservés);
		
		filmreservésTextField_1 = new JTextField();
		filmreservésTextField_1.setBounds(56, 137, 175, 20);
		contentPane.add(filmreservésTextField_1);
		filmreservésTextField_1.setColumns(10);
		
		JLabel lblNbreplaces = new JLabel("Nbreplaces:");
		lblNbreplaces.setBounds(0, 172, 46, 14);
		contentPane.add(lblNbreplaces);
		
		nbreplacesTextField_2 = new JTextField();
		nbreplacesTextField_2.setBounds(56, 166, 175, 20);
		contentPane.add(nbreplacesTextField_2);
		nbreplacesTextField_2.setColumns(10);
		JLabel lblD = new JLabel("Date");
		lblD.setBounds(0, 200, 46, 14);
		contentPane.add(lblD);
		
		dateTextField = new JTextField();
		dateTextField.setBounds(56, 197, 175, 20);
		contentPane.add(dateTextField);
		dateTextField.setColumns(10);
	//Boutons charger de recuperer les attributs de l'etudiant et d'enregistrer.
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String noms = nomsTextField.getText();
				String prenoms = prenomsTextField.getText();
				String matricule = matriculeTextField.getText();
				String telephone = telephoneTextField.getText();
				String filmreservés = filmreservésTextField_1.getText();
				int nbreplaces = Integer.parseInt(nbreplacesTextField_2.getText());
				String date = dateTextField.getText();
				//
				Etudiant etudiant =new Etudiant();
				etudiant.setNoms(noms);
				etudiant.setPrenoms(prenoms);
				etudiant.setMatricule(matricule);
				etudiant.setTelephone(telephone);
				etudiant.setFilmreservés(filmreservés);
				etudiant.setNbreplaces(nbreplaces);
				etudiant.setDate(date);	
				IService service = new ServiceImpl();
				 int status;
				status = service.enregistrerEtudiantService(etudiant);
//Code qui permet de verifier et de renvoyer un message si l'enregistrement dans la bd c'est bien passé.
						  if(status == 1) {
							  JOptionPane.showMessageDialog(null, "Etudiant " + etudiant.getNoms() + 
									  "enregistré dans la BD!");
							  
							  nomsTextField.setText("");
							  prenomsTextField.setText("");
							  matriculeTextField.setText("");
							  telephoneTextField.setText("");
							  filmreservésTextField_1.setText("");
							  nbreplacesTextField_2.setText("");
							  dateTextField.setText("");
						  }else {
							  JOptionPane.showMessageDialog(null, 
									  "Erreur lors de l'enregistrement de la reservation!!! ");
						  }
				
				
				
				
			}
		});
		btnEnregistrer.setBounds(133, 227, 89, 23);
		contentPane.add(btnEnregistrer);
		
		}
}
