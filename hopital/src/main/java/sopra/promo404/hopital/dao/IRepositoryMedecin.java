package sopra.promo404.hopital.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.Medecin;

public interface IRepositoryMedecin extends JpaRepository<Medecin, Long> {

	
	@Query("select m from Medecin m left join fetch m.salle s")
	List<Medecin> findAllMedecinByIdWithSalle(String salle);
	
	@Query("select m from Medecin m left join fetch m.specialite s")
	List<Medecin> findAllMedecinByIdWithSpecialite(String specialite);
	
	@Query("select m from Medecin m where upper(m.nom) = ?1")
	List<Medecin> findMedecinByNom(String nom);
	
	@Query("select m from Medecin m where upper(m.prenom) = ?1")
	List<Medecin> findMedecinByPrenom(String prenom);
	
	
	List<Medecin> findAllByCivilite(@Param("civilite") Civilite civilite);
//MANQUE ENUM CONVENTION
//	List<Medecin> findAllByConvention(@Param("convention") Convention convention);

	@Query("select m from Medecin m where upper(m.cmu) = ?1")
	List<Medecin> findMedecinCmu(Boolean cmu);
	
	@Query("select m from Medecin m where upper(m.convention) = ?1")
	List<Medecin> findMedecinConvention(Boolean convention);
	
}