package com.objis.cameroun.oklm1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.objis.cameroun.oklm1.domaine.Etudiant;


public class DaoImpl implements IDao {

	public DaoImpl() {
	
	}

	public int enregistrerEtudiantDao(Etudiant etudiant) {

		try {

			// Etape 1 : r�cup�ration de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : Cr�ation d'un objet  statement et preparation de la requete
			

			String sql = "insert into `cine`(`noms`,`prenoms`,`matricule`,`telephone`,`filmreserv�s`,`nbreplaces`,`date`)values (?,?,?,?,?,?,?)";
			
			PreparedStatement ps=  cn.prepareStatement(sql);
			ps.setString(1, etudiant.getNoms());
			ps.setString(2, etudiant.getPrenoms());
			ps.setString(3, etudiant.getMatricule());
			ps.setString(4, etudiant.getTelephone());
			ps.setString(5, etudiant.getFilmreserv�s());
			ps.setInt(6, etudiant.getNbreplaces());
			ps.setString(7, etudiant.getDate());
		
			// Etape 3 : ex�cution requ�te
			ps.executeUpdate();
			return 1;
			
			
			// Etape 4 : gestion des exceptions et lib�ration 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		
	
		
	

	}

	
	public List<Etudiant> listEtudiantsDao() {
		

        //Cr�ation d'une collection des reservations etudiant.
		List<Etudiant> maListEtudiant= new ArrayList<Etudiant>();
	
		try {

			// Etape 1 : r�cup�ration de la connexion
			Connection cn = ConnectionMYSQL.getInstance();

			// Etape 2 : pr�paration requ�te
			
			String sql = "SELECT * FROM cine ";
			
			Statement st = cn.createStatement();

			

			// Etape 3 : ex�cution requ�te
			ResultSet rs = st.executeQuery(sql);

			// Etape 4 :parcours Resultset (optionnel)
			while (rs.next()) {
				//recuperation des valeurs d'une ligne de la table reservation, pour initialiser dans un objet etudiant
				Etudiant etudiant =  new Etudiant();
				etudiant.setIdEtudiant(rs.getInt("idEtudiant"));
				etudiant.setNoms(rs.getString("noms"));
				etudiant.setPrenoms(rs.getString("prenoms"));
				etudiant.setMatricule(rs.getString("matricule"));
				etudiant.setTelephone(rs.getString("telephone"));
				etudiant.setFilmreserv�s(rs.getString("filmreserv�s"));
				etudiant.setNbreplaces(rs.getInt("nbreplaces"));
				etudiant.setDate(rs.getString("date"));
				
				//ajout de reservations dans List maListEtudiant
				maListEtudiant.add(etudiant); // cette instruction permet d'inserrerl'objet etudiant dans ma liste reservation
				
			}
			
			// Etape 5 : gestion des exceptions et lib�ration 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		return maListEtudiant;
		
	}

}
