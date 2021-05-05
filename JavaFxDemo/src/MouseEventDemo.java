import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application{
	
	public void start(Stage ps) {
		Pane pane = new Pane();
		Text text= new Text(20, 20, "Programming is fun");
		pane.getChildren().addAll(text);
		text.setOnMouseDragged(e -> {
			text.setX(e.getX() );
			text.setY(e.getY() );
		});
		Scene scene = new Scene(pane, 300, 100);
		ps.setTitle("Mouse Event Demo");
		ps.setScene(scene);
		ps.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
