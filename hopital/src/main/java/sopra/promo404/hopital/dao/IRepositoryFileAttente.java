package sopra.promo404.hopital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.hopital.model.FileAttente;

public interface IRepositoryFileAttente extends JpaRepository<FileAttente, Long> {

}
