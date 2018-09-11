package hopital.classes;

import java.util.ArrayList;

public class Medecin {
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

	private Salle salle;
	
	private ArrayList<String> specialites;
	
	private ArrayList<Visite> visites;
	
	private Hopital hopital;

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle,Hopital hopital) {
		this.salle = salle;
		salle.setMedecin(this);
		hopital.getMedecins().add(this);
		this.hopital = hopital;
	}
	
	public void finished() {
		this.hopital.getMedecins().remove(this);
	}
	
	public void archive() {
		this.hopital.getTablevisites().addToArchives(this.visites);
		this.visites = new ArrayList<>();
	}
	
	public void next() {
		Visite v = new Visite(this,this.salle.getPatient(),this.salle.getPatient().getSpecialite());
		this.visites.add(v);
		if (this.visites.size() == 10) {
			this.archive();
		}
		
		this.salle.setPatient(hopital.getFileencours().getPatients().get(0));
	}

	public ArrayList<String> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(ArrayList<String> specialites) {
		this.specialites = specialites;
	}

	public ArrayList<Visite> getVisites() {
		return visites;
	}

	public void setVisites(ArrayList<Visite> visites) {
		this.visites = visites;
	}
	
	public void fileState() {
		System.out.println("Il y a " + hopital.getFileencours().getPatients().size() + "patients en attente");
		for (int i = 0; i < hopital.getMedecins().size();i++) {
			System.out.println("Le prochain patient du docteur " + hopital.getMedecins().get(i).getNom() + " est " + hopital.getFileencours().getPatients().get(0));
		}
	}

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}
	
	
	
}


