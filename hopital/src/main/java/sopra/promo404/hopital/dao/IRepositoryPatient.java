package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import sopra.promo404.hopital.model.Patient;

public interface IRepositoryPatient extends JpaRepository<Patient, Long> {

	@RestResource (path="by-nom")
public Patient findByNom(@Param("nom") String nom);


	
}