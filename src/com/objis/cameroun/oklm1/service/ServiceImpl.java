package com.objis.cameroun.oklm1.service;

import java.util.List;

import com.objis.cameroun.oklm1.dao.DaoImpl;
import com.objis.cameroun.oklm1.dao.IDao;
import com.objis.cameroun.oklm1.domaine.Etudiant;

public class ServiceImpl implements IService {


	private IDao dao;
	
	public ServiceImpl() {
		
		dao = new DaoImpl();
	}

	
	public int enregistrerEtudiantService(Etudiant etudiant) {
	
		return dao.enregistrerEtudiantDao(etudiant);

	}

	
	public List<Etudiant> listEtudiantsService() {
		
		return dao.listEtudiantsDao();
	}

	 

}