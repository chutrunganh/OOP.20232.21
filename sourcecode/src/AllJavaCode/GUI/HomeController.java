package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HomeController extends BaseController {

    public HomeController() {
        super();
    }
    public HomeController(DataModel model) {
        super(model);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    void envelopedVirusClicked(MouseEvent event) {
        getDataModel().setType("Enveloped");
        switchNextScene(event);
    }

    @FXML
    void nonEnvelopedVirusClicked(MouseEvent event) {
        getDataModel().setType("Non-Enveloped");
        switchNextScene(event);
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus selection
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("VirusSelectionScene.fxml"));
            loader.setController(new VirusSelectionController(getDataModel()));
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
