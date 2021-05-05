/*File: speedlimitGUI_Mathew.java
Project: CSIS3101 Assignment 12
Author:  Mathew Doty 
History: Version 2.1 April 6, 2021*/

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
import java.util.*;

//This program will create a GUI box to enter the fine given when over the speed limit
public class speedlimitGUI_Mathew extends Application{
	
	//Set input to read exception
	public void setInput(String inp) throws InvalidInputException{
		if (!inp.equals("Yes") && !inp.equals("Y") && !inp.equals("No") && !inp.equals("N"))
			throw new InvalidInputException(inp);
	}

	//Create stage for GUI
	public void start(Stage myStage) throws InvalidInputException{
		//Title for window
		myStage.setTitle("Speeding Fine Calculator");
		
		//Set size and gaps
		GridPane rootNode = new GridPane();
		rootNode.setPadding(new Insets(15));
		rootNode.setHgap(5);
		rootNode.setVgap(5);
		rootNode.setAlignment(Pos.CENTER);
		
		//Create and size scene
		Scene myScene = new Scene(rootNode, 500, 200);
		
		//Entry text for Speed Limit
		rootNode.add(new Label("Speed Limit of a Zone"), 0, 0);
		TextField spdLmt = new TextField();
		rootNode.add(spdLmt, 1, 0);
		
		//Entry text for Vehicle Speed
		rootNode.add(new Label("Speed of Vehicle"), 0, 1);
		TextField spdVeh = new TextField();
		rootNode.add(spdVeh, 1, 1);
		
		//Entry text for Double Fine Zone
		rootNode.add(new Label("Construction or School Zone: Yes, Y, No, or N"), 0, 2);
		TextField cOsZ = new TextField();
		rootNode.add(cOsZ, 1, 2);
		
		//Create Fine Button
		Button fineButton = new Button("Enter");
		
		rootNode.add(fineButton, 1, 3);
		
		GridPane.setHalignment(fineButton, HPos.LEFT);
		
		//Output box for Total Fine
		rootNode.add(new Label("Total Fine Calculated ="), 0, 4);
		TextField fineRes = new TextField();
		fineRes.setEditable(false);
		rootNode.add(fineRes, 1, 4);
		
		//Fine Button Action
		fineButton.setOnAction(e -> {
			//Variables for text entries
			Integer spdL = Integer.valueOf(spdLmt.getText());
			Integer speed = Integer.valueOf(spdVeh.getText());
			String csZone = cOsZ.getText();
			//Custom exception and exit for invalid input
			try {
			setInput(csZone);
			}
			catch(InvalidInputException ex){
				System.out.println(ex.getMessage());
				System.exit(1);
			}
			//Difference variable
			Integer diff = speed - spdL;
			//Fine variable
			Double fine = 0.0;
			
			//Conditions to alter fine
			if (diff > 0 && diff < 5) {
				fine = 89.00;
			}
			else if (diff >= 5 && diff < 15) {
				fine = 119.00;
			}
			else if (diff >= 15 && diff < 25) {
				fine = 159.00;
			}
			else if (diff >= 25 && diff < 30) {
				fine = 229.00;
			}
			
			if (diff < 30) {
				//Double fine if in Construction or School Zone
				if (csZone.equals("Yes") || csZone.equals("Y"))
					fine *= 2;
				//Print resulting fine on output box
				fineRes.setText("$" + fine.toString());
			}
			//If 30 over limit, print "Court Mandatory" message
			else
				fineRes.setText("Court Mandatory");
		});
		
		//Set the scene
		myStage.setScene(myScene);
		myStage.show();
		
	}
	
	//Launch from Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
		
	}
}
