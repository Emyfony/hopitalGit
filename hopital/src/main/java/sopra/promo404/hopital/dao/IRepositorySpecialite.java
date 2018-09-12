package sopra.promo404.hopital.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.hopital.model.Specialite;

public interface IRepositorySpecialite extends JpaRepository<Specialite, Long> {

	@Query("select s from Specialite s")
	List<Specialite> findAllSpecialite();

	@Query("select s from Specialite s left join fetch s.consultations c")
	List<Specialite> findAllSpecialiteByIdWithConsultations(String consultation);
	
}
