package TP5;

public abstract class Atelier {
	private boolean occupe =false;
	
	public boolean isOccupe() {
		return occupe;
	}

	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}

	abstract int reparer(Voiture v);
}
