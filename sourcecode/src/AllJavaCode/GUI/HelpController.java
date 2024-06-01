package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelpController implements Initializable {

    private DataModel model;
    @FXML TextArea taDetails;

    public HelpController() {
        this.model = new DataModel();
    }

    public HelpController(DataModel model) {
        this.model = model;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taDetails.setEditable(false);
    }

    @FXML
    void homeButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("HomeScene.fxml"));
            loader.setController(new HomeController(model));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
