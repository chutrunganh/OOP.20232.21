package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController implements Initializable {

    @FXML private ImageView envelopedVirusImage;
    @FXML private ImageView nonEnvelopedVirusImage;
    @FXML private Button helpButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void envelopedVirusClicked(MouseEvent event) {
        // System.out.println("Enveloped Virus Clicked");
        // chosenTypeOfVirus = "Enveloped";
        // //Change the scene to EnvelopedVirus.fxml
        // try {
        //     Parent root = FXMLLoader.load(getClass().getResource("LoadAllVirusUI.fxml"));
        //     Scene scene = new Scene(root);
        //     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //     stage.setScene(scene);
        //     stage.show();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        System.out.println("Enveloped Virus Clicked");
    }

    @FXML
    void nonEnvelopedVirusClicked(MouseEvent event) {
        System.out.println("Non-Enveloped Virus Clicked");
    }

    @FXML
    void helpButtonClicked(MouseEvent event) {
        System.out.println("Help button clicked.");
    }

}
