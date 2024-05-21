package AllJavaCode.gui;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.virus.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    @FXML private ImageView homeButton;
    @FXML private Button helpButton;

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
            secondVirus = new RotaVirus();
            thirdVirus = new HIVVirus();
            // bind properties of viruses to nodes of scene
        case "Non-Enveloped":
            // add non-enveloped viruses and do similarly to above
            firstVirus = new CoronaVirus();
            secondVirus = new RotaVirus();
            thirdVirus = new HIVVirus();
        }
    }

    @FXML
    void homeButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("gui/HomeUI.fxml"));
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
            loader.setLocation(getClass().getResource("gui/HelpScene.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Help button clicked.");
    }

    @FXML
    void firstVirusClicked(MouseEvent event) {
        //System.out.println(firstVirus.getName() + " Clicked");
        model.setVirus(firstVirus);
        switchNextScene(event);
    }

    @FXML
    void secondVirusClicked(MouseEvent event) {
        //System.out.println(secondVirus.getName() + " Clicked");
        model.setVirus(secondVirus);
        switchNextScene(event);
    }

    @FXML
    void thirdVirusClicked(MouseEvent event) {
        //System.out.println(thirdVirus.getName() + " Clicked");
        model.setVirus(thirdVirus);
        switchNextScene(event);
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus demonstration
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("gui/ASpecificVirusUI.fxml"));
            loader.setController(new ASpecificVirusController(model));
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
