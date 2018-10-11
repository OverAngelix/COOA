package TP5;

import java.util.Random;

public class AtelierPanneLegere extends Atelier{

	@Override
	int reparer(Voiture v) {
		Random rand = new Random();
		int tempsReparation = rand.nextInt(3)+1;
		return tempsReparation;
	}
}
