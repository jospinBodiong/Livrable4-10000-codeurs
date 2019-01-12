package com.objis.cameroun.oklm1.dao;

import java.util.List;

import com.objis.cameroun.oklm1.domaine.Etudiant;

public interface IDao {

	public int enregistrerEtudiantDao(Etudiant etudiant);
	public List<Etudiant> listEtudiantsDao();
}
