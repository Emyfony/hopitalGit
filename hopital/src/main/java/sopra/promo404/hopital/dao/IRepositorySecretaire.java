package sopra.promo404.hopital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.promo404.hopital.model.Civilite;
import sopra.promo404.hopital.model.Secretaire;

public interface IRepositorySecretaire extends JpaRepository<Secretaire, Long>{


	@Query("select s from secretaire s")
	List<Secretaire> findAllSecretaire();

	@Query("select distinct s from secretaire s left join fetch e.fileattente f")
	List<Secretaire> findAllSecretaireByIdWithFileAttente(String fileAttente);


	List<Secretaire> findAllByCivilite(@Param("civilite") Civilite civilite);

	
	@Query("select s from secretaire s where upper(s.nom) = ?1")
	List<Secretaire> findSecretaireByNom(String nom);
	
	@Query("select s from secretaire s where upper(s.prenom) = ?1")
	List<Secretaire> findSecretaireByPrenom(String prenom);


	@Query("select s from secretaire s where upper(s.enPause) = ?1")
	List<Secretaire> findSecretaireEnPause(Boolean enPause);
	
}
