package hopital.classes;

import java.util.ArrayList;

public class Hopital {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Hopital() {
		super();
		this.medecins = new ArrayList<>();
	}


	private Secretaire secretaire;
	
	private ArrayList<Medecin> medecins;
	
	private FileAttente fileencours;
	
	private TableVisites tablevisites;
	
	private ArrayList<Patient> dossiers;

	public Secretaire getSecretaire() {
		return secretaire;
	}

	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
		secretaire.setHopital(this);
	}

	public ArrayList<Medecin> getMedecins() {
		return medecins;
	}

	public void setMedecins(ArrayList<Medecin> medecins) {
		this.medecins = medecins;
	}

	public FileAttente getFileencours() {
		return fileencours;
	}

	public void setFileencours(FileAttente fileencours) {
		this.fileencours = fileencours;
	}

	public TableVisites getTablevisites() {
		return tablevisites;
	}

	public void setTablevisites(TableVisites tablevisites) {
		this.tablevisites = tablevisites;
	}

	public ArrayList<Patient> getDossiers() {
		return dossiers;
	}

	public void setDossiers(ArrayList<Patient> dossiers) {
		this.dossiers = dossiers;
	}
}
