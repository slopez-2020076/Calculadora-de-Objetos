package org.santiagolopez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *  Programador: Santiago López
 *  Carné:2020076
 *  Código Técnico: IN5AV
 * 
 *  Fecha de Creación:
 *      14-04-2021
 *  Modificaciones:
 *      16-04-2021
 *      21-04-2021
 *      22-04-2021
 *      23-04-2021
 * 
 * 
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        escenarioPrincipal.setTitle("Calculadora por: Santiago López ");
        escenarioPrincipal.getIcons().add(new Image("/org/santiagolopez/images/calcu.png"));
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
