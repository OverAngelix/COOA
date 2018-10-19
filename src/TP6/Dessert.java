package TP6;

public abstract class Dessert implements UIvisit{
	private String libelle;
	private double prix;

	public String getLibelle() {
		return libelle;
	}

	protected void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	protected void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Dessert :" + libelle + ", prix :" + prix;
	}
	
	public void affiche() {
		System.out.println(getLibelle()+ " au prix de "+ getPrix());
	}
	
	public abstract void accept(VisitorPrix plop);
	
}
