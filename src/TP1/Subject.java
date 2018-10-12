package TP1;

import java.util.ArrayList;

public abstract class Subject {
		ArrayList<Observer> al = new ArrayList<>();
		void Attach(Observer obs) {
			al.add(obs);
		}
		
		void Detach(Observer obs) {
			al.remove(obs);
		}
		
	/*    public void NotifyObserver() {
		
			for (Observer a : al){
				a.Update();
			}
		}*/
	    
	    public void NotifyObserver(String o) {
			
			for (Observer a : al){
				a.Update(o);
			}
		}
}
