package AllJavaCode.gui;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.virus.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;


public class LoadAllVirusController implements Initializable {

    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;

    private DataModel model;
    private Virus firstVirus, secondVirus, thirdVirus;

    public LoadAllVirusController() {
        this.model = new DataModel();
    }
    public LoadAllVirusController(DataModel model) {
        this.model = model;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Initiate the Scene base on the Type of Virus chosen from the HomeController
        switch (model.getType()) {
        case "Enveloped":
            firstVirus = new CoronaVirus();
            secondVirus = new HepatitisBVirus();
            thirdVirus = new HIVVirus();
        case "Non-Enveloped":
            // add non-enveloped viruses and do similarly to above
            // firstVirus = new CoronaVirus();
            // secondVirus = new RotaVirus();
            // thirdVirus = new HIVVirus();
        }

        try {
            image1.setImage(new Image(getClass().getResource(firstVirus.getImagePath()).toURI().toString()));
            image2.setImage(new Image(getClass().getResource(secondVirus.getImagePath()).toURI().toString()));
            image3.setImage(new Image(getClass().getResource(thirdVirus.getImagePath()).toURI().toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        label1.setText(firstVirus.getName());
        // label1.setLayoutX(150 - label1.getWidth()/2);
        label2.setText(secondVirus.getName());
        // label2.setLayoutX(400 - label2.getWidth()/2);
        label3.setText(thirdVirus.getName());
        // label3.setLayoutX(550 - label3.getWidth()/2);
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

    @FXML
    void firstVirusClicked(MouseEvent event) {
        model.setVirus(firstVirus);
        switchNextScene(event);
    }

    @FXML
    void secondVirusClicked(MouseEvent event) {
        model.setVirus(secondVirus);
        switchNextScene(event);
    }

    @FXML
    void thirdVirusClicked(MouseEvent event) {
        model.setVirus(thirdVirus);
        switchNextScene(event);
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus demonstration
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("ASpecificVirusUI.fxml"));
            loader.setController(new ASpecificVirusController(model));
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
