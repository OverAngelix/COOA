package TP5;

import java.util.Iterator;

public class IteratorGarage implements  Iterator<Voiture>{
	private Voiture[] stock;
	int cpt;
	private int taille;
	public IteratorGarage(Voiture[] stock) {
		this.stock=stock;
		cpt=0;
		taille=stock.length;
	}
	@Override
	public boolean hasNext() {
		return cpt<taille;
	}

	@Override
	public Voiture next() {
		Voiture v = null;
		if(hasNext()) {
			v = stock[cpt];
			cpt++;
		}
		return v;
	}



}
