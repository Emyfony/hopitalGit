package sopra.promo404.hopital.controller;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.promo404.hopital.dao.IRepositoryFileAttente;
import sopra.promo404.hopital.model.FileAttente;
import sopra.promo404.hopital.model.Views;

@RestController
@RequestMapping("/fileAttente")
public class FileAttenteRestController {
	
	@Autowired
	private IRepositoryFileAttente fileAttenteRepo;
	
	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewFileAttente.class)
	public List<FileAttente> list() {
		return fileAttenteRepo.findAll();
	}
////A REVOIR
//	@GetMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewFileAttenteWithMedecin.class)
//	public FileAttente detailmedecin(@PathVariable String medecin) {
//		return (FileAttente) fileAttenteRepo.findAllFileAttenteByIdWithMedecin(medecin);
//	}
	
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewFileAttenteWithPatient.class)
	public FileAttente detailpatient(@PathVariable String patient) {
		return (FileAttente) fileAttenteRepo.findAllFileAttenteByIdWithPatient(patient);
	}
	
//	@GetMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewFileAttenteWithSecretaire.class)
//	public FileAttente detailsecretaire(@PathVariable String secretaire) {
//		return (FileAttente) fileAttenteRepo.findAllFileAttenteByIdWithSecretaire(secretaire);
//	}

	@PostMapping("")
	@ResponseBody 
	@JsonView(Views.ViewFileAttente.class)
	public FileAttente add(@RequestBody FileAttente fileAttente) {
		fileAttenteRepo.save(fileAttente);

		return fileAttente;
	}

	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewFileAttente.class)
	public FileAttente edit(@RequestBody FileAttente fileAttente, @PathVariable Long id) {
		fileAttenteRepo.save(fileAttente);

		return (FileAttente) fileAttenteRepo.findById(id).get();
	}

	@PatchMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewFileAttente.class)
	public FileAttente partialEdit(@RequestBody Map<String, Object> fields, @PathVariable Long id) {
		FileAttente fileAttente = (FileAttente) fileAttenteRepo.findById(id).get();

		for (String key : fields.keySet()) { // id=67 version=1 nom="HTML"
			Object value = fields.get(key);

			Field field = ReflectionUtils.findField(FileAttente.class, key);

			if (field.getType().equals(Long.class)) {
				value = Long.valueOf(value.toString());
			}

			ReflectionUtils.makeAccessible(field);
			ReflectionUtils.setField(field, fileAttente, value);
		}

		fileAttenteRepo.save(fileAttente);

		fileAttente = (FileAttente) fileAttenteRepo.findById(id).get();

		return fileAttente;
	}

	@DeleteMapping("/{id}")
	@JsonView(Views.ViewFileAttente.class)
	public void delete(@PathVariable Long id) {
		fileAttenteRepo.deleteById(id);
	}
}