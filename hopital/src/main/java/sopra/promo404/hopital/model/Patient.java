package sopra.promo404.hopital.model;

public class Patient {
	private Long id;

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
	
	private String informations;
	
	private boolean inscrit;

	public String getInformations() {
		return informations;
	}

	public void setInformations(String informations) {
		this.informations = informations;
	}

	public boolean isInscrit() {
		return inscrit;
	}

	public void setInscrit(boolean inscrit) {
		this.inscrit = inscrit;
	}
	
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Patient(Long id, String nom, String informations, boolean inscrit, String specialite) {
		super();
		this.id = id;
		this.nom = nom;
		this.informations = informations;
		this.inscrit = inscrit;
		this.specialite = specialite;
	}

	private String specialite;
	
	public Patient() {
		super();
		this.inscrit = false;
	}
	
}
