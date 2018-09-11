package sopra.promo404.hopital.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
@Entity
public class FileAttente {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column
	private int capacite;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="secretaire_id")
	private Secretaire secretaire;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="medecin_id")
	private Medecin medecin;
	
	public FileAttente() {
		super();
	}
	
	
	
	public FileAttente(Long id, int version, int capacite, Secretaire secretaire, Medecin medecin) {
		super();
		this.id = id;
		this.version = version;
		this.capacite = capacite;
		this.secretaire = secretaire;
		this.medecin = medecin;
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
