package TP6;

public class Crepe extends Dessert  implements UIvisit{

	public Crepe() {
		super.setLibelle("Crepe");
		super.setPrix(1.0);
	}

	@Override
	public void accept(VisitorPrix plop) {
		plop.visit(this);
		
	}
}
