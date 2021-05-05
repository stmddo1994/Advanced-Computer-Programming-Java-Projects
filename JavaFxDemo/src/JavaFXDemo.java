//Need to upload JavaFX later for this to work
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class JavaFXDemo extends Application{
	public void start (Stage primaryStage) {
		Pane pane = new Pane();
		Circle cir = new Circle();
		//cir.setCenterX(100);
		//cir.setCenterY(100);
		cir.centerXProperty().bind(pane.widthProperty().divide(2));
		cir.centerYProperty().bind(pane.heightProperty().divide(2));
		cir.setRadius(100);
		Color col1 = new Color(1.0, 0.0, 0.0, 1.0);
		Color col2 = new Color(0.0, 1.0, 0.0, 1.0);
		cir.setStroke(col1);
		cir.setFill(col2);
		
		Label label = new Label("JavaFX Label");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20.0));
		pane.getChildren().add(label);
		
		pane.getChildren().add(cir);
		
		Scene scene = new Scene(pane, 200, 500);
		//Scene scene = new Scene(new Button("New Stage"));
		primaryStage.setTitle("Circle-FX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
		
	}

}
