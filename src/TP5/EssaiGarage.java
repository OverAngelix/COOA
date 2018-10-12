package TP5;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EssaiGarage {
	public static void main(String[] args) {
		System.out.println("---OUVERTURE DU GARAGE---");
		
		//CREATION ATELIER
		Atelier al = AtelierPanneLegere.getInstance();
		Atelier as = AtelierPanneSevere.getInstance();
		
		//CREATION DES VOITURES DU JOUR
		Voiture[] vdays = new Voiture[10];
		for(int i=0;i<vdays.length;i++) {
			vdays[i] = new Voiture(159357+i);
			Random rand = new Random();
			int y = rand.nextInt(3);
			if(y==0) {
				vdays[i].setEtatVoiture(Etat.PanneLegere);
			}else if(y==1) {
				vdays[i].setEtatVoiture(Etat.PanneGrave);
			}else if(y==2){
				vdays[i].setEtatVoiture(Etat.Marche);
			}
		}
		//ARRIVER DES VOITURES DANS LE GARAGE
		Garage us = new Garage(vdays);
		Iterator<Voiture> it = us.iterator();
		/*while(it.hasNext()) {
			Voiture courant = it.next();
			System.out.println(courant.toString());
		}*/
		int pl=0;
		int ps=0;
		int vs=0;
		int vl=0;
		boolean vide = isVide(vdays);
		while(!vide) {
			System.out.println("--- NOUVEL SESSION REPARATION ---");
			for(int i=0;i<vdays.length;i++) {
				
				System.out.println(""+i+" :"+vdays[i].getEtatVoiture());
				if(vdays[i].getEtatVoiture()==Etat.Marche) {
					System.out.println("VOITURE MARCHE LE CLIENT LA REPRISE");
				}
				else if(vdays[i].getEtatVoiture()==Etat.PanneGrave) {
					if(!as.isOccupe()) {
						vdays[i].setAtelierrepar(as);
						as.setOccupe(true);
						vs=i;
						ps=as.reparer(vdays[i]);
						System.out.println("VOITURE EN REPARATION GRAVE");
					}
				}
				else {
					if(!al.isOccupe()) {
						vdays[i].setAtelierrepar(al);
						al.setOccupe(true);
						pl=al.reparer(vdays[i]);
						vl=i;
						System.out.println("VOITURE EN REPARATION LEGERE");
					}
				}
			}
			if(pl==0) {
				vdays[vl].setEtatVoiture(Etat.Marche);
				al.setOccupe(false);
			}
			if(ps==0) {
				vdays[vs].setEtatVoiture(Etat.Marche);
				as.setOccupe(false);
			}
			vide = isVide(vdays);
			System.out.println("\n REPARATION LEGER TEMPS:"+ps+" pour la voiture "+vs);
			System.out.println("\n REPARATION SEVERE TEMPS:"+pl+" pour la voiture "+vl);
			if(al.isOccupe()){pl--;}
			if(as.isOccupe()){ps--;}
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
		}
		
		System.out.println("JOURNEE TERMINEE");
	}
	
	public static boolean isVide(Voiture[] tab) {
		for(int i=0;i<tab.length;i++) {
			if(!(tab[i].getEtatVoiture()==Etat.Marche)) {
				return false;
			}
		}
		return true;
	}
}
