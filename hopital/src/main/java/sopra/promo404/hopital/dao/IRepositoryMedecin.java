package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.Medecin;

public interface IRepositoryMedecin extends JpaRepository<Medecin, Long> {

	
}