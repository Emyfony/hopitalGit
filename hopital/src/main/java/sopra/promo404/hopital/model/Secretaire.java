package sopra.promo404.hopital.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Secretaire {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(length = 100)
	private String nom;

	@Column(length = 100)
	private String prenom;
	@Column()
	private Civilite civilite;
	@Column
	private boolean enPause;
	@Column
	@OneToMany(mappedBy = "Secretaire", fetch=FetchType.LAZY)
	private List<FileAttente> fileAttentes = new ArrayList<>();

	public Secretaire() {
		super();
	}


	public Secretaire(Long id, int version, String nom, String prenom, Civilite civilite, boolean enPause,
			List<FileAttente> fileAttentes) {
		super();
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.enPause = enPause;
		this.fileAttentes = fileAttentes;
	}


	public Long getId() {
		return id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public List<FileAttente> getFileAttentes() {
		return fileAttentes;
	}

	public void setFileAttentes(List<FileAttente> fileAttentes) {
		this.fileAttentes = fileAttentes;
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