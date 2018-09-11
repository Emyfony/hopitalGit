package sopra.promo404.hopital.model;

import java.util.ArrayList;

import javax.persistence.Column;

import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;
import javax.persistence.Entity;
@Entity
public class Medecin {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Enumerated
	@Column
	private Convention conventionne;
	@Column
	private boolean carteVitale;
	@Column
	private boolean cmu;
	@OneToOne
	@JoinColumn(name = "salle_id")
	private Salle salle;
	@OneToMany(mappedBy= "medecin", fetch=FetchType.EAGER)
	private ArrayList<FileAttente> fileAttentes;
	@OneToMany(mappedBy= "medecin", fetch=FetchType.EAGER)
	private ArrayList<Specialite> specialites;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	

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

	
	
	

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	
	
	

	
	public ArrayList<Specialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(ArrayList<Specialite> specialites) {
		this.specialites = specialites;
	}

	public ArrayList<FileAttente> getFileattente() {
		return fileAttentes;
	}

	public void setFileattente(ArrayList<FileAttente> fileAttentes) {
		this.fileAttentes = fileAttentes;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Convention getConventionne() {
		return conventionne;
	}

	public void setConventionne(Convention conventionne) {
		this.conventionne = conventionne;
	}

	public boolean isCarteVitale() {
		return carteVitale;
	}

	public void setCarteVitale(boolean carteVitale) {
		this.carteVitale = carteVitale;
	}

	public boolean isCmu() {
		return cmu;
	}

	public void setCmu(boolean cmu) {
		this.cmu = cmu;
	}
	
	
	
	
	
	
}


