package com.objis.cameroun.oklm1.domaine;

public class Etudiant {

	private int idEtudiant;
	private String noms;
	private String prenoms;
	private String matricule;
	private String telephone;
	private String platreserver;
	private String filmreserv�s;
	private int nbreplaces;
	private String date;
	
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, String matricule, String telephone,
			String fimreserv�s, int nbreplaces, String date) {
		super();
		this.noms = nom;
		this.prenoms = prenom;
		this.matricule = matricule;
		this.telephone = telephone;
		this.filmreserv�s = fimreserv�s;
		this.nbreplaces = nbreplaces;
		this.date = date;
	}

	public Etudiant(int idEtudiant, String noms, String prenoms, String matricule, String telephone, 
			String filmreserv�s, int nbreplaces, String date, String fimreserver) {
		super();
		this.idEtudiant = idEtudiant;
		this.noms = noms;
		this.prenoms = prenoms;
		this.matricule = matricule;
		this.telephone = telephone;
		this.filmreserv�s = filmreserv�s;
		this.nbreplaces = nbreplaces;
		this.date = date;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public String getNoms() {
		return noms;
	}

	public void setNoms(String noms) {
		this.noms = noms;
	}

	public String getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFilmreserv�s() {
		return filmreserv�s;
	}

	public void setFilmreserv�s(String filmreserv�s) {
		this.filmreserv�s = filmreserv�s;
	}

	public int getNbreplaces() {
		return nbreplaces;
	}

	public void setNbreplaces(int nbreplaces) {
		this.nbreplaces = nbreplaces;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", noms=" + noms + ", prenoms=" + prenoms + ", matricule=" + matricule
				+ ", telephone=" + telephone + ", platreserver=" + platreserver + ", filmreserv�s=" + filmreserv�s
				+ ", nbreplaces=" + nbreplaces + ", date=" + date + "]";
	}
	
}
