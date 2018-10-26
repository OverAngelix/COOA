package API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Gps {
	 
	public static void main(String[] args) throws Exception {
		String loc1 = new String("Lille");
		 String loc2 = new String("Paris");
		System.setProperty("http.proxyHost", "cache.univ-lille1.fr");
		System.setProperty("http.proxyPort", "3128");
		URL u = new URL("http://open.mapquestapi.com/directions/v2/route?key=MzJPF68KYbwEXaqFr3rasHfabgXU5dcd&from="+loc1+"&to="+loc2+"&unit=k");
		URLConnection c = u.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
		String inputLine = in.readLine();
		String [] value = inputLine.split(",");
			
		System.out.println("la distance entre "+ loc1 + " et " + loc2 + " est de " +value[6].substring(11, value[6].length()) + "KM");
		in.close();
		
		URL v = new URL("http://api.openweathermap.org/data/2.5/forecast?q="+loc2+"&APPID=a627747b324b5c59cc68ae303a056581&lang=fr");
		URLConnection b = v.openConnection();
		BufferedReader ino = new BufferedReader(new InputStreamReader(b.getInputStream()));
		String inputLine2 = ino.readLine();
		String [] value2 = inputLine2.split("\"description\":\"");
		System.out.println("VOICI LA METEO DE DEMAIN A "+loc2);
			int cpt=0;
			boolean findes=true;
			int heure=9;
			for(int i=9;i<15;i++) {
			while(findes) {
					if(value2[i].charAt(cpt)==',') {
						findes=false;
					}
					cpt++;
			}
			System.out.println("à "+heure+" h le temps sera : "+value2[i].substring(0, cpt-2));
			cpt=0;
			findes=true;
			heure+=3;
			}
		

	//	System.out.println(inputLine2);
		ino.close();
		}
}
