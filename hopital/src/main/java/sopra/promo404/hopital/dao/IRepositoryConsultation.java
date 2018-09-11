package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.Consultation;

public interface IRepositoryConsultation extends JpaRepository<Consultation, Long> {

	
}