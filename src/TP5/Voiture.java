package TP5;

public class Voiture {
	private int immatriculation;
	private Etat etatVoiture;
	
	public Voiture(int im,Etat etat) {
		this.immatriculation=im;
		this.etatVoiture=etat;
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
