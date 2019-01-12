package com.objis.cameroun.oklm1.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.objis.cameroun.oklm1.domaine.Etudiant;
import com.objis.cameroun.oklm1.service.IService;
import com.objis.cameroun.oklm1.service.ServiceImpl;



public class Menue {
	public Menue() {

	}

	public static void main(String[] args) {

		//Enregistrement des reservations.
		Etudiant etudiant1 = new Etudiant ( "BODIONG","Alain","14Y546","696248262","Avengers",3,"10/18");
	    Etudiant etudiant2 = new Etudiant ("MOPELT","Steve","14R753","654245444","Prisonbreak",15,"11/18");

	//Appel de la couche service.
	IService service = new ServiceImpl();
	//service.enregistrerEtudiantService(etudiant1);
	//service.enregistrerEtudiantService(etudiant2);
	
	//lister les reservations d'etudiants de la base de donnees.
	 //declaration d'une collection des etudiants
	List<Etudiant> etudiants;
//Appel de la methode list etudiant service de la couche service.
	
	etudiants = service.listEtudiantsService();
	
//Affichage de la liste des etudiants ayant effectuer reservation.
	for(Etudiant etudiant : etudiants)
	{
	  System.out.println(etudiant);
	}
	}

	}

