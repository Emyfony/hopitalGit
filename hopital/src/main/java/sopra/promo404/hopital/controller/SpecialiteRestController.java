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


import sopra.promo404.hopital.dao.IRepositorySpecialite;
import sopra.promo404.hopital.model.Specialite;
import sopra.promo404.hopital.model.Views;


@RestController
@RequestMapping("/specialite")
public class SpecialiteRestController {
	@Autowired
	private IRepositorySpecialite specialiteRepo;
	
	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewSpecialite.class)
	public List<Specialite> list() {
		return specialiteRepo.findAllSpecialite();
	}
//A REVOIR
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewSpecialiteWithMedecin.class)
	public Specialite detailmedecin(@PathVariable String medecin) {
		return (Specialite) specialiteRepo.findAllSpecialiteByIdWithMedecins(medecin);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewSpecialiteWithConsultation.class)
	public Specialite detailconsultation(@PathVariable String consultation) {
		return (Specialite) specialiteRepo.findAllSpecialiteByIdWithMedecins(consultation);
	}

	@PostMapping("")
	@ResponseBody 
	@JsonView(Views.ViewSpecialite.class)
	public Specialite add(@RequestBody Specialite specialite) {
		specialiteRepo.save(specialite);

		return specialite;
	}

	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewSpecialite.class)
	public Specialite edit(@RequestBody Specialite specialite, @PathVariable Long id) {
		specialiteRepo.save(specialite);

		return (Specialite) specialiteRepo.findById(id).get();
	}

	@PatchMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewSpecialite.class)
	public Specialite partialEdit(@RequestBody Map<String, Object> fields, @PathVariable Long id) {
		Specialite specialite = (Specialite) specialiteRepo.findById(id).get();

		for (String key : fields.keySet()) { // id=67 version=1 nom="HTML"
			Object value = fields.get(key);

			Field field = ReflectionUtils.findField(Specialite.class, key);

			if (field.getType().equals(Long.class)) {
				value = Long.valueOf(value.toString());
			}

			ReflectionUtils.makeAccessible(field);
			ReflectionUtils.setField(field, specialite, value);
		}

		specialiteRepo.save(specialite);

		specialite = (Specialite) specialiteRepo.findById(id).get();

		return specialite;
	}

	@DeleteMapping("/{id}")
	@JsonView(Views.ViewSpecialite.class)
	public void delete(@PathVariable Long id) {
		specialiteRepo.deleteById(id);
	}
}
