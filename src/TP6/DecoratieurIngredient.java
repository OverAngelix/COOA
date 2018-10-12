package TP6;

public abstract class DecoratieurIngredient {
	protected Dessert dessert;
	
	public String getLibelle() {
		return dessert.getLibelle();
	}
	
	public double getPrix() {
		return dessert.getPrix();
	}
	
}
