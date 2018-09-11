package sopra.promo404.hopital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private Long id;

	private String nom;
	
	private String prenom;

	private String numSecuriteSocial;
	
	private Civilite civilite;
	
	//Constructeur
	public Patient() {
		super();
	}
	
	public Patient(Long id, String nom, String prenom, String numSecuriteSocial, Civilite civilite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numSecuriteSocial = numSecuriteSocial;
		this.civilite = civilite;
	}

	//Getter Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getNumSecuriteSocial() {
		return numSecuriteSocial;
	}

	public void setNumSecuriteSocial(String numSecuriteSocial) {
		this.numSecuriteSocial = numSecuriteSocial;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	

	

}
