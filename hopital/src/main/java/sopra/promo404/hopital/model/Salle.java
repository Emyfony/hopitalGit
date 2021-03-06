package sopra.promo404.hopital.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.promo404.hopital.model.Views;

import javax.persistence.Entity;
@Entity
public class Salle {
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
	@OneToMany(mappedBy= "salle", fetch=FetchType.LAZY)
	@JsonView(Views.ViewSalle.class)
	private List<Consultation> consultations;
	@OneToOne(mappedBy= "salle", fetch=FetchType.LAZY)
	@JsonView(Views.ViewSalle.class)
	private Medecin medecin;

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
	
	

	public List<Consultation> getConsultation() {
		return consultations;
	}

	public void setConsultation(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
}
