package sopra.promo404.hopital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.Secretaire;

public interface IRepositorySecretaire extends JpaRepository<Secretaire, Long>{


	@Query("select s from Secretaire s")
	List<Secretaire> findAllSecretaire();

	@Query("select distinct s from Secretaire s left join fetch e.fileattente f")
	List<Secretaire> findAllSecretaireByIdWithFileAttente(String fileAttente);


	List<Secretaire> findAllByCivilite(@Param("civilite") Civilite civilite);

	
	@Query("select s from Secretaire s where upper(s.nom) = ?1")
	List<Secretaire> findSecretaireByNom(String nom);
	
	@Query("select s from Secretaire s where upper(s.prenom) = ?1")
	List<Secretaire> findSecretaireByPrenom(String prenom);


	@Query("select s from Secretaire s where upper(s.enPause) = ?1")
	List<Secretaire> findSecretaireEnPause(Boolean enPause);
	
}
