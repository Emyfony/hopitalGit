package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.Patient;

public interface IRepositoryPatient extends JpaRepository<Patient, Long> {
//	@Query("select m from Matiere m left join fetch m.formateurs f where m.id = :id")
//	Matiere findByIdWithFormateurs(@Param("id") Long id);
	
}