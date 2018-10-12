package TP2;

import java.util.Observable;

public class TemperatureModel extends Observable{
	public  double tempDeg=20.0;

	public  double getTempdeg() {
		return tempDeg;
	}

	public  void setTempDeg(double tempDeg) {
		this.tempDeg = tempDeg;
		setChanged();
		notifyObservers();
	}
	
	public  double getTempFar() {
		return tempDeg*(9.0/5.0)+32.0;
	}

	public  void setTempFar(double tempFar) {
		this.tempDeg = (tempFar-32.0)/(9.0/5.0);
		setChanged();
		notifyObservers();
	}
}
