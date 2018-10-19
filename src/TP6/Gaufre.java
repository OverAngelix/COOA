package TP6;

public class Gaufre extends Dessert implements UIvisit{

	public Gaufre() {
		super.setLibelle("Gaufre");
		super.setPrix(2.0);
	}

	@Override
	public void accept(VisitorPrix plop) {
		plop.visit(this);
	}

}
