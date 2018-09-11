package sopra.promo404.hopital.model;

import java.util.ArrayList;

public class FileAttente {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private ArrayList<Patient> patients;

	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void addPatient(Patient patient) {
		this.patients.add(patient);
	}

	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}

	public FileAttente() {
		super();
		this.patients = new ArrayList<Patient>();
	}
		
	
}
