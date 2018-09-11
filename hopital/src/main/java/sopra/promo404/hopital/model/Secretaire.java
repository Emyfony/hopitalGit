package sopra.promo404.hopital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Secretaire {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 100)
	private String nom;

	@Column(length = 100)
	private String prenom;
	@Column()
	private Civilite civilite;
	@Column
	private boolean enPause;

	public Secretaire() {
		super();
	}

	public Long getId() {
		return id;
	}

	public Long setId(Long id) {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isEnPause() {
		return enPause;
	}

	public void setEnPause(boolean enPause) {
		this.enPause = enPause;
	}
}