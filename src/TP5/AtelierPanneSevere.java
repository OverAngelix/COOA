package TP5;
import java.util.*;
public class AtelierPanneSevere extends Atelier{

	@Override
	int reparer(Voiture v) {
		Random rand = new Random();
		int tempsReparation = rand.nextInt(3)+3;
		return tempsReparation;
	}
	

}
