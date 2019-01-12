package com.objis.cameroun.oklm1.service;

import java.util.List;
import com.objis.cameroun.oklm1.domaine.Etudiant;

public interface IService {

	public int enregistrerEtudiantService(Etudiant etudiant);
	public List<Etudiant> listEtudiantsService();
	
	
}
