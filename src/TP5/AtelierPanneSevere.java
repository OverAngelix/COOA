package TP5;
import java.util.*;

public class AtelierPanneSevere extends Atelier{
	private static AtelierPanneSevere instance =null;
	private AtelierPanneSevere() {
	
	}
	 public static synchronized AtelierPanneSevere getInstance() {
		 if(instance==null) {
			 instance=new AtelierPanneSevere();
		 }
		 return instance;
	 }
	@Override
	int reparer(Voiture v) {
		Random rand = new Random();
		int tempsReparation = rand.nextInt(4)+4;
		return tempsReparation;
	}
	

}
