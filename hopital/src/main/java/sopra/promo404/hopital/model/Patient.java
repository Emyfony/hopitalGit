package sopra.promo404.hopital.model;

import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private Long id;
	
	@Version
	private int version;

	@Column
	private String nom;
	
	@Column
	private String prenom;

	@Column
	private String numSecuriteSocial;
	
	@Enumerated
	@Column(name = "civility", length = 10)
	private Civilite civilite;
	
	@OneToMany(mappedBy = "patient", fetch=FetchType.LAZY)
	private List<Consultation> consultations;
	
	//Constructeur
	public Patient() {
		super();
	}
	


	public Patient(Long id, int version, String nom, String prenom, String numSecuriteSocial, Civilite civilite) {
		super();
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
		this.numSecuriteSocial = numSecuriteSocial;
		this.civilite = civilite;
	}

	

	public Patient(String nom) {
		super();
		this.nom = nom;
	}



	//Getter Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
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



	public List<Consultation> getConsultations() {
		return consultations;
	}



	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	

}
