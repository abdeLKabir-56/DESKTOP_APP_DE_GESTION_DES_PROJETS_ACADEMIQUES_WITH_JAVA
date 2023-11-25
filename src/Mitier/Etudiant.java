package Mitier;

public class Etudiant  {
	private String CNE;
	private String nom;
	private String prenom;
	private String niveau;
	private String filiere;
	private String email;
	private String mdp;
	public Etudiant(String CNE, String nom, String prenom, String niveau,String filiere, String email, String mdp) {
		super();
		CNE = CNE;
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
		this.filiere = filiere;
		this.email = email;
		this.mdp = mdp;
	}
	public Etudiant() {
		super();
	}
	public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	@Override
	public String toString() {
		return "Etudiant [CNE=" + CNE + ", nom=" + nom + ", prenom=" + prenom + ", niveau=" + niveau + ", filiere="
				+ filiere + ", email=" + email + ", mdp=" + mdp + "]";
	}
	public Object get(int columnIndex) {
		
		switch (columnIndex){
			case 0 : return this.CNE; 
			case 1 : return this.nom; 
			case 2 : return this.prenom; 
			case 3 : return this.niveau; 
			case 4 : return this.filiere; 
			case 5 : return this.email; 
			case 6 : return this.mdp; 
			default : return null;
		}
	}
	
}
