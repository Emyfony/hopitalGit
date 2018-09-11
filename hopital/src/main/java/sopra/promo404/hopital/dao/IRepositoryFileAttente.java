package sopra.promo404.hopital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.hopital.model.FileAttente;

public interface IRepositoryFileAttente extends JpaRepository<FileAttente, Long> {
	

	@Query("select distinct f from fileAttente left join fetch f.patient p")
	List<FileAttente> findAllFileAttenteByIdWithPatient(String patient);
	
	@Query("select distinct f from fileAttente left join fetch f.secretaire s")
	List<FileAttente> findAllFileAttenteByIdWithSecretaire(String secretaire);
	
	@Query("select distinct f from fileAttente left join fetch f.medecin m")
	List<FileAttente> findAllFileAttenteByIdWithMedecin(String medecin);


	
	@Query("select f from fileAttente where upper(f.capacite) = ?1")
	List<FileAttente> findSecretaireByCapacite(int capacite);



}
