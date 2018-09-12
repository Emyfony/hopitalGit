package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.hopital.model.Consultation;

public interface IRepositoryConsultation extends JpaRepository<Consultation, Long> {
	@Query("select c from Consultation c join c.patient p where p.id = :id")
	Consultation findByPatient(Long id);
}