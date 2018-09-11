package sopra.promo404.hopital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
