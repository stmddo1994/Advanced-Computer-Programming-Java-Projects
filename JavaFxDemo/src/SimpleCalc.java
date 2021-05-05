import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.layout.*;

public class SimpleCalc extends Application{
	
	public void start(Stage myStage) {
		myStage.setTitle("Addition Calculator");
		
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(15));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 300, 200);
		
		rootNode.add(new Label("First Number"), 0, 0);
		TextField firstValue = new TextField();
		rootNode.add(firstValue, 1, 0);
		
		rootNode.add(new Label("Second Number"), 0, 1);
		TextField secValue = new TextField();
		rootNode.add(secValue, 1, 1);
		
		rootNode.add(new Label("Third Number"), 0, 2);
		TextField thdValue = new TextField();
		rootNode.add(thdValue, 1, 2);
		
		rootNode.add(new Label("Sum is: "), 0, 3);
		
		Button aButton = new Button("Compute Sum");
		
		rootNode.add(aButton, 1, 3);
		
		GridPane.setHalignment(aButton, HPos.LEFT);
		
		TextField result = new TextField();
		result.setEditable(false);
		rootNode.add(result, 1, 4);
		
		aButton.setOnAction(e -> {
			Integer val1 = Integer.valueOf(firstValue.getText());
			Integer val2 = Integer.valueOf(secValue.getText());
			Integer val3 = Integer.valueOf(thdValue.getText());
			Integer r = val1 + val2 + val3;
			result.setText(r.toString());
			
		});
		
		myStage.setScene(myScene);
		myStage.show();
		
		//Participation: Add one more number to the grid and result is updated to sum of three numbers
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
		
		

	}

}
