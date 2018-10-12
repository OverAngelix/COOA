package TDD1;

import java.util.ArrayList;

public class Calculatrice {
	String charactcal = "0123456789+-*/";	
	
	
	public String executemultisansprio(String calc) {
		String op1= "";
		ArrayList<String >op2=new ArrayList<>();
		ArrayList<String >opera=new ArrayList<>();
		String op2temp ="";
		if(calc.length()>1) {
			for(int i = 0 ; i<calc.length();i++) {
			if(!charactcal.contains(""+calc.charAt(i))){
				return "ERREUR DE SAISIE";
			}
		}
		}
		if(calc.length()<3) {
			return "ERREUR DE SAISIE";
		}
		else {
			int idxtab=0;
			boolean rempop1 = true;
			for(int i = 0 ; i<calc.length();i++) {
				if(calc.charAt(i)=='+' || calc.charAt(i)=='*' || calc.charAt(i)=='/' || calc.charAt(i)=='-') {
					opera.add(""+calc.charAt(i));
					rempop1=false;
					i++;
				}
				if(rempop1) {
					op1=""+calc.charAt(i);
				}
				if(!rempop1) {
					op2.add(""+calc.charAt(i));
				}
				
			}
			
			return calculemulti(op1, opera, op2);
			
		}
	}
	public String calculemulti(String op1,ArrayList<String>  opera,ArrayList<String>  op2) {
		int resultint = Integer.parseInt(op1);
		for(int i = 0;i<op2.size();i++) {
			
		
		if(opera.get(i).equals("+")) {
			resultint+=Integer.parseInt(op2.get(i));
		}
		if(opera.get(i).equals("-")) {
			resultint-=Integer.parseInt(op2.get(i));
		}
		if(opera.get(i).equals("*")) {
			resultint*=Integer.parseInt(op2.get(i));
		}
		if(opera.get(i).equals("/")) {
			resultint/=Integer.parseInt(op2.get(i));
		}
		}
		return ""+resultint;
	}
}
