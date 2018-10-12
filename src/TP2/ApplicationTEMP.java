package TP2;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationTEMP extends Application{
	
	static TemperatureModel tm = new TemperatureModel();
	static TempControl tc = new TempControl(tm);
	static vue1 deg = new vue1(tm,tc);
	static vue2 far = new vue2(tm,tc);
	static vue3 slidDeg = new vue3(tm,tc);
	static vue4 slidFar = new vue4(tm,tc);
	@Override
	public void start(Stage primaryStage) throws Exception {
		deg.start(new Stage());
		far.start(new Stage());
		slidDeg.start(new Stage());
		slidFar.start(new Stage());
	}
	
	public static void main(String[] args) {
		tm.addObserver(deg);
		tm.addObserver(far);
		tm.addObserver(slidDeg);
		tm.addObserver(slidFar);
		Application.launch(args);
	}

}
