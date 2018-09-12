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
	public Secretaire detailfile(@PathVariable Long id) {
		return (Secretaire) secretaireRepo.findAllSecretaireByIdWithFileAttente(id);
	}
	
	
	@PostMapping("")
	@ResponseBody 
	@JsonView(Views.ViewSecretaire.class)
	public Secretaire add(@RequestBody Secretaire secretaire) {
		secretaireRepo.save(secretaire);

}

