package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.Specialite;

public interface IRepositorySpecialite extends JpaRepository<Specialite, Long> {

	
}