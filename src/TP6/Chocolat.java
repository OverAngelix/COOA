package TP6;

public class Chocolat extends DecoratieurIngredient implements UIvisit{

	public Chocolat(Dessert d) {
		
		this.dessert=d;
		this.dessert.setLibelle(d.getLibelle()+" au chocolat");
		this.dessert.setPrix(d.getPrix()+1.5);
	}
	
	public String getLibelle() {
		return this.getLibelle();
	}
	
	public double getPrix() {
		return this.getPrix();
	}

	@Override
	public void accept(VisitorPrix plop) {
		plop.visit(this);
		
	}
	
	
}
