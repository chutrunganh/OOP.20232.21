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
    public static String chosenTypeOfVirus; //Store the chosen type  Enveloped or Non-Enveloped Virus

    @FXML
    void EnvelopedVirusClicked(MouseEvent event) {
        System.out.println("Enveloped Virus Clicked");
        chosenTypeOfVirus = "Enveloped";
        //Change the scene to EnvelopedVirus.fxml
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoadAllVirusUI.fxml"));
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
        chosenTypeOfVirus = "Non-Enveloped";
        //Change the scene to NonEnvelopedVirus.fxml
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LoadAllVirusUI.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
