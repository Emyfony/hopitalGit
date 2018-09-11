package hopital.classes;

public class Visite {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private Medecin medecin;
	
	private Patient patient;
	
	private String specialite;
	
	private Long tarif;

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Long getTarif() {
		return tarif;
	}

	public void setTarif(Long tarif) {
		this.tarif = tarif;
	}

	public Visite() {
		super();
	}
	
	public Visite(Medecin medecin, Patient patient, String specialite) {
		super();
		this.medecin = medecin;
		this.patient = patient;
		this.specialite = specialite;
	}
	
}
