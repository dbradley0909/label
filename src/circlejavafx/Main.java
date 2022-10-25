package circlejavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
//import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
 
   
    public void start(Stage s)
    {
        
        s.setTitle("Circle");

        
        Circle circle = new Circle(250.0f, 150.0f, 50.f);
  
       
        Group group = new Group(circle);
  
        Scene scene = new Scene(group, 500, 300);
        s.setScene(scene
        );
  
        s.show();
    }
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}