package TP5;

import java.util.Iterator;

public class EssaiGarage {
	public static void main(String[] args) {
		Voiture v1 = new Voiture(123456,Etat.Marche);
		Voiture v2 = new Voiture(789123, Etat.PanneLegere);
		Voiture v3 = new Voiture(159753, Etat.PanneGrave);
		Voiture[] sg = new Voiture[] {v1,v2,v3};
		Garage us = new Garage(sg);
		Iterator<Voiture> it = us.iterator();
		
		while(it.hasNext()) {
			Voiture courant = it.next();
			System.out.println(courant.getImmatriculation()+" est en : "+courant.getEtatVoiture());
		}
	}
}
