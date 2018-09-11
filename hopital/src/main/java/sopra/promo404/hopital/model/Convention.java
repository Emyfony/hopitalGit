package sopra.promo404.hopital.model;

public enum Convention {
	
	S1("Secteur 1"), S2("Secteur 2"), S3("Secteur 3");

	private final String label;

	private Convention(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
