/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jose
 */
public class FXMLExample extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // Cargamos un contenedor Parent con el mapeo del fichro FXML
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        
        // Establecemos la escena siendo el objeto Parent anterior el nodo root
        Scene scene = new Scene(root, 300, 275);
        
        // Establecemos titulo
        stage.setTitle("FXML Welcome");
        // Establecemos la escena
        stage.setScene(scene);
        // Mostramos el escenario
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
