package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController implements Initializable {

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
        switchNextScene(event);
    }

    @FXML
    void nonEnvelopedVirusClicked(MouseEvent event) {
        model.setType("Non-Enveloped");
        switchNextScene(event);
    }

    @FXML
    void helpButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("HelpScene.fxml"));
            loader.setController(new HelpController(model));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus selection
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("LoadAllVirusUI.fxml"));
            loader.setController(new LoadAllVirusController(model));
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
