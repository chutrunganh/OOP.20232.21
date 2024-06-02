package AllJavaCode.gui;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.virus.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;


public class LoadAllVirusController extends BaseController {

    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;

    private Virus firstVirus, secondVirus, thirdVirus;

    public LoadAllVirusController() {
        super();
    }
    public LoadAllVirusController(DataModel model) {
        super(model);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        //Initiate the Scene base on the Type of Virus chosen from the HomeController
        switch (getDataModel().getType()) {
        case "Enveloped":
            firstVirus = new CoronaVirus();
            secondVirus = new HepatitisBVirus();
            thirdVirus = new HIVVirus();
        case "Non-Enveloped":
            // firstVirus = new CoronaVirus();
            // secondVirus = new RotaVirus();
            // thirdVirus = new HIVVirus();
        }

        // Set virus images
        try {
            image1.setImage(new Image(getClass().getResource(firstVirus.getImagePath()).toURI().toString()));
            image2.setImage(new Image(getClass().getResource(secondVirus.getImagePath()).toURI().toString()));
            image3.setImage(new Image(getClass().getResource(thirdVirus.getImagePath()).toURI().toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // Set virus names
        label1.setText(firstVirus.getName());
        label2.setText(secondVirus.getName());
        label3.setText(thirdVirus.getName());
    }

    @FXML
    void firstVirusClicked(MouseEvent event) {
        getDataModel().setVirus(firstVirus);
        switchNextScene(event);
    }

    @FXML
    void secondVirusClicked(MouseEvent event) {
        getDataModel().setVirus(secondVirus);
        switchNextScene(event);
    }

    @FXML
    void thirdVirusClicked(MouseEvent event) {
        getDataModel().setVirus(thirdVirus);
        switchNextScene(event);
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus demonstration
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ASpecificVirusUI.fxml"));
            loader.setController(new ASpecificVirusController(getDataModel()));
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
