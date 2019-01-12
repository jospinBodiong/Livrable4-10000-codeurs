package com.objis.cameroun.oklm1.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EtudiantModel extends AbstractTableModel {

    private final String[] entetes = {"Numero","Noms", "Prenoms","Matricule","Telephone","Filmreservés","Nbreplaces","Date"};

    private List< Etudiant> etudiants;

    public EtudiantModel(List< Etudiant>  etudiants) {  
        this.etudiants =  etudiants; 
    }


    public List< Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setAgriculteurs(List< Etudiant>  etudiants) {
		this.etudiants = etudiants;
	}



	@Override
    public int getRowCount() {
        return etudiants.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                // ID
                return etudiants.get(rowIndex).getIdEtudiant();

            case 1:
                // Matricule
                return etudiants.get(rowIndex).getNoms();
            case 2:
                // Nom
                return etudiants.get(rowIndex).getPrenoms();
            case 3:
                // Prenom
                return etudiants.get(rowIndex).getMatricule();
            case 4:
                // Matricule
                return etudiants.get(rowIndex).getTelephone();
            case 5:
                // Telephone
                return etudiants.get(rowIndex).getFilmreservés();	
            case 6:
                // Nbreplaces
                return etudiants.get(rowIndex).getNbreplaces();
            case 7:
                // Date
                return etudiants.get(rowIndex).getDate();
            default:
                throw new IllegalArgumentException();

        }
       
        
    }



}
