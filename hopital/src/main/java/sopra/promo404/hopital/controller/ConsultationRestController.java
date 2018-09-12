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

import sopra.promo404.hopital.dao.IRepositoryConsultation;
import sopra.promo404.hopital.model.Consultation;
import sopra.promo404.hopital.model.Views;

@RestController
@RequestMapping("/consultation")
public class ConsultationRestController {

	@Autowired
	private IRepositoryConsultation consuRepo;

	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewConsultation.class)
	public List<Consultation> list() {
		return consuRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewConsultationWithClient.class)
	public Consultation detail(@PathVariable Long id) {
		return consuRepo.findById(id).get();	}
	
	
	@PostMapping("")
	@ResponseBody
	@JsonView(Views.ViewConsultation.class)
	public Consultation add(@RequestBody Consultation consu) {
		consuRepo.save(consu);

		return consu;
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewConsultationWithClient.class)
	public Consultation edit(@RequestBody Consultation consu, @PathVariable Long id) {
		consuRepo.save(consu);

		return (Consultation) consuRepo.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	@JsonView(Views.ViewConsultationWithClient.class)
	public void delete(@PathVariable Long id) {
		consuRepo.deleteById(id);
	}
}
