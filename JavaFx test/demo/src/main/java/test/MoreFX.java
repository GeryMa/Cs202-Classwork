package test;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class MoreFX extends Application {
   private Label celcLabel; 
   private Label farenLabel;
   private TextField celcField;
   private TextField farenField; 
   private Button calcButton;   
   
   @Override
   public void start(Stage applicationStage) {
      Scene scene = null;         // Scene contains all content
      GridPane gridPane = null;   // Positions components within scene
      
      gridPane = new GridPane();   // Create an empty pane
      scene = new Scene(gridPane); // Create scene containing the grid pane
      
      // Set hourly and yearly salary
      celcLabel = new Label("Celcius: ");
      farenLabel = new Label("Farenheit:");
      
      farenField = new TextField(); 
      farenField.setPrefColumnCount(15);
      farenField.setEditable(true);
      farenField.setText("0");
      
      celcField = new TextField(); 
      celcField.setPrefColumnCount(15);
      celcField.setEditable(false);
      
      // Create a "Calculate" button
      calcButton = new Button("Calculate");
      
      gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
      gridPane.setHgap(10);                            // Spacing between columns
      gridPane.setVgap(10);                            // Spacing between rows
      
      gridPane.add(celcLabel, 0, 0);  // Add wage label to location (0, 0)
      gridPane.add(farenField, 1, 0);  // Add wage text field to location (1, 0)
      gridPane.add(farenLabel, 0, 1);   // Add salary label to location (0, 1)
      gridPane.add(celcField, 1, 1);   // Add salary text field to location (1, 1)
      gridPane.add(calcButton, 0, 2); // Add calculate button to location (0, 2)
      
      // Set an event handler to handle button presses
      calcButton.setOnAction(new EventHandler<ActionEvent>() {
         @Override
         public void handle(ActionEvent event) {
            
            String userInput; 
            double celcius;    
            double farenheit;    
            userInput = farenField.getText();            
            celcius = Integer.parseInt(userInput);
            farenheit = celcius * 1.8 + 32;
            celcField.setText(Double.toString(farenheit));
         } 
      });
      
      applicationStage.setScene(scene);    // Set window's scene  
      applicationStage.setTitle("Temperature Conversion"); // Set window's title
      applicationStage.show();             // Display window
   }
   
   public static void main(String [] args) {
      launch(args); // Launch application
   }
}
