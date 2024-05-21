package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    @FXML private TextArea taVirusInfectMechanism;
    private DataModel model;

    public ASpecificVirusController(DataModel model) {
        this.model = model;
    }

    public void initialize(URL locations, ResourceBundle resources) {}

    @FXML
    void backToHomeClicked(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HomeUI.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
