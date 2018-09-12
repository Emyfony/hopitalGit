package sopra.promo404.hopital.model;

public class Views {


	public static class ViewCommon {
	}

	public static class ViewPatient extends ViewCommon {

	}

	public static class ViewSpecialite extends ViewCommon {
	}

	public static class ViewSpecialiteWithMedecin extends ViewSpecialite {
	}

	public static class ViewSpecialiteWithConsultation extends ViewSpecialite {
	}

	public static class ViewSecretaire extends ViewCommon {
	}

	public static class ViewSecretaireWithFileAttente extends ViewSecretaire {
	}

	public static class ViewMedecin extends ViewCommon {
	}
	
	public static class ViewMedecinWithFileAttente extends ViewMedecin {
	}

	
	public static class ViewMedecinWithSalle extends ViewMedecin {
	}

	public static class ViewMedecinWithSpecialite extends ViewMedecin {
	}

	public static class ViewFileAttente extends ViewCommon {

	}

	public static class ViewFileAttenteWithMedecin extends ViewFileAttente {
	}

	public static class ViewFileAttenteWithSecretaire extends ViewFileAttente {
	}

	public static class ViewFileAttenteWithPatient extends ViewFileAttente {
	}

	public static class ViewSalle extends ViewCommon {
	}
	
	
	public static class ViewConsultation extends ViewCommon {
	}
	
	
}