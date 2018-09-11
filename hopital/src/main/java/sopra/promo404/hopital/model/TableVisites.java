package sopra.promo404.hopital.model;

import java.util.ArrayList;

public class TableVisites {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private ArrayList<Consultation> archives;

	public ArrayList<Consultation> getArchives() {
		return archives;
	}

	public void setArchives(ArrayList<Consultation> archives) {
		this.archives = archives;
	}
	
	public void addToArchives(ArrayList<Consultation> archives) {
		this.archives.addAll(archives);
	}
}
