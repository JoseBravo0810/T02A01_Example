
package fxmlexample;
 
// Imports
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
public class FXMLExampleController {
    // Variable que referencia el texto que tiene la funcion actionTarget asignada
    @FXML private Text actiontarget;
    
    // Controlador que gestiona la accion que realiza el boton 
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }

}
