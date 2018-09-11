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
	
	private String nom;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private Salle salle;
	
	private FileAttente fileattente;
	
	private ArrayList<Specialite> specialites;
	
	

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
	
	
	
	
	
	
}


