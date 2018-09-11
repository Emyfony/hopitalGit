package sopra.promo404.hopital.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.persistence.Entity;
@Entity
public class Specialite {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column
	private String libelle;
	@Column
	private Float tarif;
	@OneToMany(mappedBy= "specialite", fetch=FetchType.EAGER)
	private ArrayList<Consultation> consultations;
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="medecin_id")
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Float getTarif() {
		return tarif;
	}

	public void setTarif(Float tarif) {
		this.tarif = tarif;
	}

	public ArrayList<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(ArrayList<Consultation> consultations) {
		this.consultations = consultations;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
}
