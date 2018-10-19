package TP6;

public class EssaiDessert {
	public static void main(String[] args) throws ExceptionCreation {
			Dessert d1 = new CreationDessert().getDessert("Crepe");
			DecoratieurIngredient c1 = new Chocolat(d1);
			c1 = new Chantily(d1);
			
			Dessert d2 = new CreationDessert().getDessert("Gaufre");
			DecoratieurIngredient c2 = new Chocolat(d2);
			
			Assortiments as = new Assortiments();
			as.add(d1);
			as.add(d2);
			as.affiche();
			System.out.println("Le prix de ce lot avec remise a 10 est de "+as.prixTotal());
			
			 DessertPrintVisitor up = new DessertPrintVisitor();		 
		            d1.accept(up);
		            d2.accept(up);
		            System.out.println("prix total brut ; "+up.prixTot);
		            System.out.println("le nb de stock est de " + up.stock);
		
	}
}
