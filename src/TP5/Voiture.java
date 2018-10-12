package TP5;

public class Voiture {
	private int immatriculation;
	private Etat etatVoiture;
	private Atelier atelierrepar;
	
	public Voiture(int im) {
		this.immatriculation=im;
		this.etatVoiture=Etat.Marche;
	}

	@Override
	public String toString() {
		return "Voiture [immatriculation=" + immatriculation + ", etatVoiture=" + etatVoiture + ", atelierrepar="
				+ atelierrepar + "]";
	}

	public Atelier getAtelierrepar() {
		return atelierrepar;
	}

	public void setAtelierrepar(Atelier atelierrepar) {
		this.atelierrepar = atelierrepar;
	}

	public int getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(int immatriculation) {
		this.immatriculation = immatriculation;
	}

	public Etat getEtatVoiture() {
		return etatVoiture;
	}

	public void setEtatVoiture(Etat etatVoiture) {
		this.etatVoiture = etatVoiture;
	}
	
	
}
