package TP6;

import java.util.ArrayList;
import java.util.List;

public class Assortiments extends Dessert{
	public List<Dessert> assortiments = new ArrayList<Dessert>();
	
	@Override
	public void affiche() {
		for(Dessert d : assortiments) {
			d.affiche();
		}
	}
	
	public void add(Dessert d) {assortiments.add(d);}
	public void remove(Dessert d) {assortiments.remove(d);}
	
	public List<Dessert> getChild(){
		return assortiments;
	}
	
	public double prixTotal() {
		double pt=0;
		for(Dessert d : assortiments) {
			pt+=d.getPrix();
		}
		pt=pt-pt*0.1;
		
		return pt;
	}
}
