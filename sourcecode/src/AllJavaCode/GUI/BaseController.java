package AllJavaCode.gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public abstract class BaseController implements Initializable{

    private DataModel model;

    public BaseController(DataModel model) {
        this.model = model;
    }

    public BaseController() {
        this.model = new DataModel();
    }
    
    public DataModel getDataModel() {
        return model;
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

    @FXML
    void helpButtonClicked(MouseEvent event) {
        // create help scene with home button
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
}
