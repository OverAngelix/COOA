
package TP1;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConcreteSubject  extends Subject{
	public String subject="";
	 ConcreteObserver co;
	private static String message;
	
	public TextArea ta = new TextArea();
	TextField tf = new TextField();
	public TextArea getTa() {
		return ta;
	}


	public void setTa(TextArea ta) {
		this.ta = ta;
	}


	public void start(Stage primaryStage) throws Exception {
		
		
		
		Button badd = new Button("Nouvel auditeur");
	    badd.setMaxSize(10000, 10000);
	   
	    
	    badd.setOnMouseClicked(e->{
	    	co = new ConcreteObserver(this);
	    	try {
	    		Stage s1 = new Stage();
				co.start(s1);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	super.Attach(co);
	    });
	    
	    tf.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
 			public void handle(KeyEvent event) {
 				if(event.getCode()==KeyCode.ENTER) {
 					//SetState(tf.getText());
 					NotifyObserver(tf.getText());
 					subject=subject+"\n"+tf.getText() ;
 					ta.setText(subject);
 					tf.clear();
 					
 				}
 			}
 		});		
		VBox vb = new VBox();
		vb.getChildren().addAll(badd,ta,tf);
		Scene sc = new Scene(vb,200,230);
		primaryStage.setTitle("RADIO TCHAT");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	

	public static String GetState() {
		return message;
	}
	
	public  void SetState(String s) {
		message=s;
	subject=subject+"\n" +GetState();
		ta.setText(subject);
		
		
		
	}
}
