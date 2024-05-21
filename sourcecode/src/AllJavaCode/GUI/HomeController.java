package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
    private DataModel model;

    public HomeController() {
        this.model = new DataModel();
    }
    public HomeController(DataModel model) {
        this.model = model;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void envelopedVirusClicked(MouseEvent event) {
        model.setType("Enveloped");
        System.out.println(model.getType());
        switchNextScene(event);
    }

    @FXML
    void nonEnvelopedVirusClicked(MouseEvent event) {
        model.setType("Non-Enveloped");
        System.out.println(model.getType());
        switchNextScene(event);
    }

    @FXML
    void helpButtonClicked(MouseEvent event) {
        // create help scene with home button
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("gui/HelpScene.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Help button clicked.");
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus selection
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("gui/LoadAllVirusUI.fxml"));
            loader.setController(new LoadAllVirusController(model));
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
