package sopra.promo404.hopital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.hopital.model.Secretaire;

public interface IRepositorySecretaire extends JpaRepository<Secretaire, Long>{


	@Query("select s from Secretaire s")
	List<Secretaire> findAllSecretaire();

	@Query("select s from Secretaire s left join fetch s.fileAttentes f where s.id = ?1")
	List<Secretaire> findAllSecretaireByIdWithFileAttente(Long id);

	
}
