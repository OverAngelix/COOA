package TP2;

import java.util.Observable;
import java.util.Observer;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class vue2 implements Observer{
	TextField temp;
	
	public TemperatureModel tm;
	TempControl tc;
	Scene sc;
	VBox app ;
	public vue2(TemperatureModel tm,TempControl tc) {
		this.tm=tm;
		this.tc=tc;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		temp.setText(""+tm.getTempFar());
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
		Label tempdeg = new Label("TEMPERATURE FAR");
		temp = new TextField(""+tm.getTempFar());
		
		Button minus = new Button("-");
		minus.addEventHandler(javafx.event.ActionEvent.ACTION, e->{
			tc.modifminusF();
			
			
			
		});
		
		Button plus = new Button("+");
		plus.setOnMouseClicked(e->{
			tc.modifplusF();
		});
		
		temp.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
 			public void handle(KeyEvent event) {
 				if(event.getCode()==KeyCode.ENTER) {
 					double t= Double.valueOf(temp.getText());
 					tc.FixF(t);
 				}
 			}});
		
		HBox button = new HBox();
		button.getChildren().addAll(minus,plus);
		app = new VBox();
		app.getChildren().addAll(tempdeg,temp,button);
		
		sc = new Scene(app,200,80);
		primaryStage.setTitle("TEMPFAR");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
}
