package sopra.promo404.hopital.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Consultation {
	
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;

	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	
	@Temporal(TemporalType.DATE)
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonView(Views.ViewCommon.class)
	private Date dtVisiteArrive;
	
	@Temporal(TemporalType.DATE)
	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonView(Views.ViewCommon.class)
	private Date dtVisiteFin;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	@JsonView(Views.ViewConsultationWithClient.class)
	private Patient patient;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "salle_id")
	private Salle salle;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "specialite_id")
	private Specialite specialite;
	
	

	

	public Consultation() {
		super();
	}



	public Consultation(Long id, int version, Date dtVisiteArrive, Date dtVisiteFin) {
		super();
		this.id = id;
		this.version = version;
		this.dtVisiteArrive = dtVisiteArrive;
		this.dtVisiteFin = dtVisiteFin;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}



	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public Date getDtVisiteArrive() {
		return dtVisiteArrive;
	}



	public void setDtVisiteArrive(Date dtVisiteArrive) {
		this.dtVisiteArrive = dtVisiteArrive;
	}



	public Date getDtVisiteFin() {
		return dtVisiteFin;
	}



	public void setDtVisiteFin(Date dtVisiteFin) {
		this.dtVisiteFin = dtVisiteFin;
	}
	
	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
