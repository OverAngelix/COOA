package TP2;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import TP1.ConcreteSubject;
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

public class vue1 implements Observer{
	TextField temp;

	public TemperatureModel tm;
	TempControl tc;
	Scene sc;
	VBox app ;
	public vue1(TemperatureModel tm,TempControl tc) {
		this.tm=tm;
		this.tc=tc;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		temp.setText(""+tm.getTempdeg());
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
		Label tempdeg = new Label("TEMPERATURE DEGRES");
		temp = new TextField(""+tm.getTempdeg());
		
		Button minus = new Button("-");
		minus.addEventHandler(javafx.event.ActionEvent.ACTION, e->{
			tc.modifminusC();	
		});
		
		Button plus = new Button("+");
		plus.setOnMouseClicked(e->{
			tc.modifplusC();	
		});
		
		temp.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
 			public void handle(KeyEvent event) {
 				if(event.getCode()==KeyCode.ENTER) {
 					double t= Double.valueOf(temp.getText());
 					tc.fixC(t);
 				}
 			}});
 				
		HBox button = new HBox();
		button.getChildren().addAll(minus,plus);
		app = new VBox();
		app.getChildren().addAll(tempdeg,temp,button);
		
		sc= new Scene(app,200,80);
		primaryStage.setTitle("TEMPDEG");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
}
