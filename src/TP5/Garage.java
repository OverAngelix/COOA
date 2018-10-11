package TP5;

import java.util.Iterator;

public class Garage implements Iterable<Voiture>{
	private Voiture[] storage;

	public Garage(Voiture[] stock) {
		this.storage=stock;
	}
	@Override
	public Iterator<Voiture> iterator() {
		
		return new IteratorGarage(storage);
	}
}
