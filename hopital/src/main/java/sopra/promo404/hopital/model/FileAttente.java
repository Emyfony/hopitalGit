package sopra.promo404.hopital.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;
@Entity
public class FileAttente {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Column
	@JsonView(Views.ViewCommon.class)
	private int capacite;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="secretaire_id")
	@JsonView(Views.ViewCommon.class)
	private Secretaire secretaire;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="medecin_id")
	@JsonView(Views.ViewCommon.class)
	private Medecin medecin;
	
	@OneToMany(mappedBy = "fileAttente", fetch=FetchType.LAZY)
	@JsonView(Views.ViewCommon.class)
	private List<Patient> patients;
	
	
	public FileAttente() {
		super();
	}
	
	
		

	public FileAttente(Long id, int version, int capacite, Secretaire secretaire, Medecin medecin,
			List<Patient> patients) {
		super();
		this.id = id;
		this.version = version;
		this.capacite = capacite;
		this.secretaire = secretaire;
		this.medecin = medecin;
		this.patients = patients;
	}









	public List<Patient> getPatients() {
		return patients;
	}



	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}




	public Secretaire getSecretaire() {
		return secretaire;
	}



	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}



	public Medecin getMedecin() {
		return medecin;
	}



	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}



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
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	
}
