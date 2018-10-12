package TP2;

import javafx.scene.control.Slider;

public class TempControl {
	TemperatureModel tm;
	
	public TempControl(TemperatureModel tm) {
		this.tm = tm;
	}
	public void modifminusC() {
			tm.setTempDeg(tm.getTempdeg()-1.0);
	}
	
	public void modifplusC() {
		
		tm.setTempDeg(tm.getTempdeg()+1.0);
	}
	
	public void modifminusF() {
		
		tm.setTempFar(tm.getTempFar()-1.0);
}

	public void modifplusF() {
	
	tm.setTempFar(tm.getTempFar()+1.0);
	}
	
	public void modifSliC(Slider s) {
		tm.setTempDeg(s.getValue());
	}
	
	public void FixF(double i) {
		tm.setTempFar(i);
	}
	
	public void fixC(double i) {
		tm.setTempDeg(i);
	}
	
	public void modifSliF(Slider s) {
		tm.setTempFar(s.getValue());
	}
	}

