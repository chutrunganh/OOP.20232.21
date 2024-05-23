package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ASpecificVirusController implements Initializable{

    @FXML private TextArea taVirusInfo;
    @FXML private ImageView virusImage;
    @FXML private ImageView homeButton;
    @FXML private Button helpButton;
    @FXML private TextArea taVirusInfectMechanism;
    private DataModel model;

    public ASpecificVirusController() {
        this.model = new DataModel();
    }
    public ASpecificVirusController(DataModel model) {
        this.model = model;
    }

    public void initialize(URL locations, ResourceBundle resources) {
        // bind properties from model
    }

    @FXML
    void homeButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("HomeUI.fxml"));
            loader.setController(new HomeController(model));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void helpButtonClicked(MouseEvent event) {
        // create help scene with home button
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("HelpScene.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // System.out.println("Help button clicked.");
    }
    
}
