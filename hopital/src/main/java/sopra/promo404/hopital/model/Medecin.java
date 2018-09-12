package sopra.promo404.hopital.model;

import java.util.List;

import javax.persistence.Column;

import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Entity;
@Entity
public class Medecin {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String prenom;
	@Enumerated
	@Column
	@JsonView(Views.ViewCommon.class)
	private Convention conventionne;
	@Column
	@JsonView(Views.ViewCommon.class)
	private boolean carteVitale;
	@Column
	@JsonView(Views.ViewCommon.class)
	private boolean cmu;
	@OneToOne
	@JoinColumn(name = "salle_id")
	@JsonView(Views.ViewMedecin.class)
	private Salle salle;
	@OneToMany(mappedBy= "medecin", fetch=FetchType.LAZY)
	@JsonView(Views.ViewMedecin.class)
	private List<FileAttente> fileAttentes;
	@JsonView(Views.ViewMedecin.class)
	@OneToMany(mappedBy= "medecin", fetch=FetchType.LAZY)
	private List<Specialite> specialites;

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
	
	
	
	

	
	public List<Specialite> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}

	public List<FileAttente> getFileattente() {
		return fileAttentes;
	}

	public void setFileattente(List<FileAttente> fileAttentes) {
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


