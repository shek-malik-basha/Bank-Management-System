/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

/**
 *
 * @author Chandan Das
 */
public class BankManagement extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BankMain.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(
    getClass().getResource("modern.css").toExternalForm()
);
        
        stage.setScene(scene);
        stage.show();
        FadeTransition fade = new FadeTransition(Duration.millis(650), root);
fade.setFromValue(0.0);
fade.setToValue(1.0);
fade.play();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
