package sopra.promo404.hopital.model;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

public class Medecin {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	
	private String nom;
	
	private String prenom;
	
	private Convention conventionne;
	
	private boolean carteVitale;
	
	private boolean cmu;
	
	private Salle salle;
	
	private FileAttente fileattente;
	
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

	public FileAttente getFileattente() {
		return fileattente;
	}

	public void setFileattente(FileAttente fileattente) {
		this.fileattente = fileattente;
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


