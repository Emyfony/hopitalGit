package hopital.classes;

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
	
	public void print() {
		for (int i = 1 ; i <= this.patients.size() ; i++) {
			System.out.println(i + " : " + this.patients.get(i-1).getNom() + ", désire voir un " + this.patients.get(i-1).getSpecialite());
		}
		
	}
}
