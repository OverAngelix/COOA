package TP5;

import java.util.Random;

public class AtelierPanneLegere extends Atelier{
	private static AtelierPanneLegere instance =null;
	private AtelierPanneLegere() {
	
	}
	 public static synchronized AtelierPanneLegere getInstance() {
		 if(instance==null) {
			 instance=new AtelierPanneLegere();
		 }
		 return instance;
	 }
	@Override
	int reparer(Voiture v) {
		Random rand = new Random();
		int tempsReparation = rand.nextInt(3)+1;
		return tempsReparation;
	}
}
