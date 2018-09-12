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

import sopra.promo404.hopital.dao.IRepositorySecretaire;
import sopra.promo404.hopital.model.Secretaire;
import sopra.promo404.hopital.model.Views;
import sopra.promo404.hopital.model.Views.ViewSecretaireWithFileAttente;

@RestController
@RequestMapping("/secretaire")

public class SecretaireRestController {
	@Autowired
	private IRepositorySecretaire secretaireRepo;
	
	@GetMapping("")
	@ResponseBody
	@JsonView(Views.ViewSecretaire.class)
	public List<Secretaire> list() {
		return secretaireRepo.findAllSecretaire();
	}
//A REVOIR
	@GetMapping("/{id}")
	@ResponseBody
	@JsonView(ViewSecretaireWithFileAttente.class)
	public Secretaire detailfile(@PathVariable String fileAttente) {
		return (Secretaire) secretaireRepo.findAllSecretaireByIdWithFileAttente(fileAttente);
	}
	
	
	@PostMapping("")
	@ResponseBody 
	@JsonView(Views.ViewSecretaire.class)
	public Secretaire add(@RequestBody Secretaire secretaire) {
		secretaireRepo.save(secretaire);

		return secretaire;
	}

	@PutMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewSecretaire.class)
	public Secretaire edit(@RequestBody Secretaire secretaire, @PathVariable Long id) {
		secretaireRepo.save(secretaire);

		return (Secretaire) secretaireRepo.findById(id).get();
	}

	@PatchMapping("/{id}")
	@ResponseBody
	@JsonView(Views.ViewSecretaire.class)
	public Secretaire partialEdit(@RequestBody Map<String, Object> fields, @PathVariable Long id) {
		Secretaire secretaire = (Secretaire) secretaireRepo.findById(id).get();

		for (String key : fields.keySet()) { // id=67 version=1 nom="HTML"
			Object value = fields.get(key);

			Field field = ReflectionUtils.findField(Secretaire.class, key);

			if (field.getType().equals(Long.class)) {
				value = Long.valueOf(value.toString());
			}

			ReflectionUtils.makeAccessible(field);
			ReflectionUtils.setField(field, secretaire, value);
		}

		secretaireRepo.save(secretaire);

		secretaire = (Secretaire) secretaireRepo.findById(id).get();

		return secretaire;
	}

	@DeleteMapping("/{id}")
	@JsonView(Views.ViewSecretaire.class)
	public void delete(@PathVariable Long id) {
		secretaireRepo.deleteById(id);
	}

}

