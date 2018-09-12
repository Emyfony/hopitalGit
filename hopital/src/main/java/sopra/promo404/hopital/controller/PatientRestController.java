package sopra.promo404.hopital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.promo404.hopital.dao.IRepositoryPatient;
import sopra.promo404.hopital.model.Patient;
import sopra.promo404.hopital.model.Views;

@RestController
@RequestMapping("/patient")
public class PatientRestController {

	@Autowired
	private IRepositoryPatient patientRepo;

	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewPatient.class)
	public List<Patient> list() {
		return patientRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewPatientWithFileAttente.class)
	public Patient detail(@PathVariable Long id) {
		return patientRepo.findById(id).get();	}
	
	
	@PostMapping("")
	@ResponseBody
	@JsonView(Views.ViewPatient.class)
	public Patient add(@RequestBody Patient patient) {
		patientRepo.save(patient);

		return patient;
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewPatientWithFileAttente.class)
	public Patient edit(@RequestBody Patient patient, @PathVariable Long id) {
		patientRepo.save(patient);

		return (Patient) patientRepo.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	@JsonView(Views.ViewPatientWithFileAttente.class)
	public void delete(@PathVariable Long id) {
//		Patient patient = (Patient) patientRepo.findById(id).get();
//		patient.setConsultations(null);
//		patientRepo.save(patient);
		patientRepo.deleteById(id);
	}
}
