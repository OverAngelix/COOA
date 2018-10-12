package TP2;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class vue3 implements Observer{
	Slider slider = new Slider();
	public TemperatureModel tm;
	TempControl tc;
	Scene sc;
	VBox app ;
	public vue3(TemperatureModel tm,TempControl tc) {
		this.tm=tm;
		this.tc=tc;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		slider.setValue(tm.getTempdeg());
		if(tm.getTempdeg()>50) {
			app.setStyle("-fx-background-color: red;");
			
		}
		else if(tm.getTempdeg()<0) {
			app.setStyle("-fx-background-color: cyan;");
		}else {
			app.setStyle("-fx-background-color: white;");
		}
		}
	public void start(Stage primaryStage) throws Exception {
		Label tempdeg = new Label("SLIDER DEGRES");
		
		slider.setMin(-20);
		slider.setMax(100);
		slider.setValue(tm.getTempdeg());
		slider.setShowTickLabels(true);
		slider.setShowTickMarks(true);
		slider.setMinorTickCount(5);
		slider.setBlockIncrement(10);
		
		slider.setOnMouseDragged(e->{
			tc.modifSliC(slider);
		});
		app = new VBox();
		app.getChildren().addAll(tempdeg,slider);
		
		sc = new Scene(app,200,80);
		primaryStage.setTitle("SLIDEDEG");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
}
