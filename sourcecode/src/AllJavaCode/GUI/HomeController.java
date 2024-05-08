package AllJavaCode.GUI;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController {

    @FXML
    void EnvelopedVirusClicked(MouseEvent event) {
        System.out.println("Enveloped Virus Clicked");

        
        //Change the scene to EnvelopedVirus.fxml
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EnvelopedVirus.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void NonEnvelopedVirusClicked(MouseEvent event) {
        System.out.println("Non-Enveloped Virus Clicked");
    }

}
