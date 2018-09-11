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
	
	private ArrayList<Visite> archives;

	public ArrayList<Visite> getArchives() {
		return archives;
	}

	public void setArchives(ArrayList<Visite> archives) {
		this.archives = archives;
	}
	
	public void addToArchives(ArrayList<Visite> archives) {
		this.archives.addAll(archives);
	}
}
