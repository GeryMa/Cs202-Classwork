package test;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception  {
    primaryStage.setTitle("Title of the Window");
    button = new Button("Click me");
    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout, 300, 250);  //sets the size of the scene in pixels
    primaryStage.setScene(scene); //pass in your scene
    primaryStage.show(); //displays the window
}
}
