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

import sopra.promo404.hopital.dao.IRepositoryMedecin;
import sopra.promo404.hopital.model.Medecin;

import sopra.promo404.hopital.model.Views;


@RestController
@RequestMapping("/medecin")
public class MedecinRestController {

	
//	@Autowired
//	private IRepositoryMedecin medecinRepo;
//	
//	@GetMapping("")
//	@ResponseBody
//	@JsonView(Views.ViewMedecin.class)
//	public List<Medecin> list() {
//		return medecinRepo.findAll();
//	}
////A REVOIR
//	@GetMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewMedecinWithSpecialite.class)
//	public Medecin detailspecialite(@PathVariable String specialite) {
//		return (Medecin) medecinRepo.findAllMedecinByIdWithSpecialite(specialite);
//	}
//	
//	@GetMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewMedecinWithSalle.class)
//	public Medecin detailsalle(@PathVariable String salle) {
//		return (Medecin) medecinRepo.findAllMedecinByIdWithSalle(salle);
//	}
//	
//	@GetMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewMedecinWithFileAttente.class)
//	public Medecin detailfileattente(@PathVariable String fileAttente) {
//		return (Medecin) medecinRepo.findAllMedecinByIdWithFileAttente(fileAttente);
//	}
//
//	@PostMapping("")
//	@ResponseBody 
//	@JsonView(Views.ViewMedecin.class)
//	public Medecin add(@RequestBody Medecin medecin) {
//		medecinRepo.save(medecin);
//
//		return medecin;
//	}
//
//	@PutMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewMedecin.class)
//	public Medecin edit(@RequestBody Medecin medecin, @PathVariable Long id) {
//		medecinRepo.save(medecin);
//
//		return (Medecin) medecinRepo.findById(id).get();
//	}
//
//	@PatchMapping("/{id}")
//	@ResponseBody
//	@JsonView(Views.ViewMedecin.class)
//	public Medecin partialEdit(@RequestBody Map<String, Object> fields, @PathVariable Long id) {
//		Medecin medecin = (Medecin) medecinRepo.findById(id).get();
//
//		for (String key : fields.keySet()) { // id=67 version=1 nom="HTML"
//			Object value = fields.get(key);
//
//			Field field = ReflectionUtils.findField(Medecin.class, key);
//
//			if (field.getType().equals(Long.class)) {
//				value = Long.valueOf(value.toString());
//			}
//
//			ReflectionUtils.makeAccessible(field);
//			ReflectionUtils.setField(field, medecin, value);
//		}
//
//		medecinRepo.save(medecin);
//
//		medecin = (Medecin) medecinRepo.findById(id).get();
//
//		return medecin;
//	}
//
//	@DeleteMapping("/{id}")
//	@JsonView(Views.ViewMedecin.class)
//	public void delete(@PathVariable Long id) {
//		medecinRepo.deleteById(id);
//	}
}
