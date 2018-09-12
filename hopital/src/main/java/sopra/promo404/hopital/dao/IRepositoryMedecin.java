package sopra.promo404.hopital.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.promo404.hopital.model.Civilite;
import sopra.promo404.hopital.model.Convention;
import sopra.promo404.hopital.model.Medecin;

public interface IRepositoryMedecin extends JpaRepository<Medecin, Long> {


	@Query("select m from Medecin m left join fetch m.fileAttentes f where m.id =?1")
	List<Medecin> findAllMedecinByIdWithFileAttente(Long id);
	
	@Query("select m from Medecin m left join fetch m.salle s where m.id =?1")
	List<Medecin> findAllMedecinByIdWithSalle(Long id);
	
	@Query("select m from Medecin m left join fetch m.specialites s where m.id =?1")
	Medecin findMedecinByIdWithSpecialite(Long id);
	
	@Query("select m from Medecin m where upper(m.nom) = ?1")
	List<Medecin> findMedecinByNom(String nom);
	
	@Query("select m from Medecin m where upper(m.prenom) = ?1")
	List<Medecin> findMedecinByPrenom(String prenom);
	
	
	

	@Query("select m from Medecin m where upper(m.cmu) = ?1")
	List<Medecin> findMedecinCmu(Boolean cmu);
	
	@Query("select m from Medecin m where m.conventionne = ?1")
	List<Medecin> findMedecinConvention(Convention convention);
	
}