package sopra.promo404.hopital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sopra.promo404.hopital.model.FileAttente;

public interface IRepositoryFileAttente extends JpaRepository<FileAttente, Long> {
	
//
//	@Query("select distinct f from FileAttente left join fetch f.patient p")
//	List<FileAttente> findAllFileAttenteByIdWithPatient(String patient);
//	
//	@Query("select distinct f from FileAttente left join fetch f.secretaire s")
//	List<FileAttente> findAllFileAttenteByIdWithSecretaire(String secretaire);
//	
//	@Query("select distinct f from FileAttente left join fetch f.medecin m")
//	List<FileAttente> findAllFileAttenteByIdWithMedecin(String medecin);
//
//
//	
//	@Query("select f from FileAttente where upper(f.capacite) = ?1")
//	List<FileAttente> findSecretaireByCapacite(int capacite);
//

	@Query("select distinct f from FileAttente f left join fetch f.patients p")
	List<FileAttente> findAllFileAttenteByIdWithPatient(String patient);
	
	@Query("select distinct f from FileAttente f left join fetch f.secretaire s")
	List<FileAttente> findAllFileAttenteByIdWithSecretaire(String secretaire);
	
	@Query("select distinct f from FileAttente f left join fetch f.medecin m")
	List<FileAttente> findAllFileAttenteByIdWithMedecin(String medecin);


	
	@Query("select f from FileAttente f where upper(f.capacite) = ?1")
	List<FileAttente> findSecretaireByCapacite(int capacite);



}
