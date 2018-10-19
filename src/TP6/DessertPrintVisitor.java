package TP6;

public class DessertPrintVisitor implements VisitorPrix {
	double prixTot = 0.0;
	int stock=0;
	@Override
	public void visit(Gaufre g) {
		System.out.println("Visit "+ g.getLibelle());
		prixTot+=g.getPrix();
		stock++;
		
	}

	@Override
	public void visit(Crepe c) {
		System.out.println("Visit "+ c.getLibelle());
		prixTot+=c.getPrix();
		stock++;
	}

	@Override
	public void visit(Chocolat cho) {
		System.out.println("Visit CHOCOLAT");
		prixTot+=cho.getPrix();
		stock++;
	}

	@Override
	public void visit(Chantily chan) {
		System.out.println("Visit CHANTILT");
		prixTot+=chan.getPrix();
		stock++;
	}

}
