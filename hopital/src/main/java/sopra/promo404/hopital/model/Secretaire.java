package hopital.classes;

public class Secretaire {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private String nom;
	
	private Hopital hopital;

	private FileAttente filesave;
	
	String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public FileAttente getFilesave() {
		return filesave;
	}

	public void setFilesave(FileAttente filesave) {
		this.filesave = filesave;
	}
	
	public void getToWork(boolean newday) {
		if (newday) {
			this.hopital.setFileencours(new FileAttente());
			this.filesave = null;
		}
		else {
			hopital.setFileencours(filesave);
		}
	}
	
	public void fileState() {
		System.out.println("Il y a " + hopital.getFileencours().getPatients().size() + " patients en attente.");
		for (int i = 0; i < this.hopital.getMedecins().size();i++) {
			System.out.println("Le prochain patient du docteur " + this.hopital.getMedecins().get(i).getNom() + " est " + this.hopital.getFileencours().getPatients().get(0).getNom());
		}
	}

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}
	
	public void inscrire(Patient patient) {
		if(patient.isInscrit() == false) {
			patient.setInscrit(true);
			this.hopital.getDossiers().add(patient);
		}
	}

	public void alafile(Patient patient) {
		if (patient.isInscrit()) {
			this.hopital.getFileencours().addPatient(patient);
		}
	}
	
	public void printFile() {
		this.hopital.getFileencours().print();
	}
}
