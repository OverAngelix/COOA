package TP6;

public class Chantily extends DecoratieurIngredient  implements UIvisit{

	public Chantily(Dessert d) {
		this.dessert=d;
		this.dessert.setLibelle(d.getLibelle()+" chantily");
		this.dessert.setPrix(d.getPrix()+0.5);
	}
	
	public String getLibelle() {
		return  this.getLibelle();
	}
	
	public double getPrix() {
		return this.getPrix();
	}

	@Override
	public void accept(VisitorPrix plop) {
		plop.visit(this);
		
	}
}
