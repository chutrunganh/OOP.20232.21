package all_java_code.gui;

import all_java_code.virus.Virus;
import all_java_code.virus.non_enveloped_viruses.PolioVirus;
import all_java_code.virus.non_enveloped_viruses.RhinoVirus;
import all_java_code.virus.non_enveloped_viruses.RotaVirus;
import all_java_code.virus.enveloped_viruses.CoronaVirus;
import all_java_code.virus.enveloped_viruses.HIVVirus;
import all_java_code.virus.enveloped_viruses.HepatitisBVirus;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Controller for the virus Selection scene
 * Allows user to choose between 3 specific viruses by clicking on the respective image
 * Three virus belong to Enveloped or Non-Enveloped category, based on the user choice from the Home scene
 */
public class VirusSelectionController extends BaseController {

    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;

    private Virus firstVirus, secondVirus, thirdVirus; // Currently, only allows for 3 viruses to be displayed

    //Constructor
    public VirusSelectionController() {
        super();
    }
    public VirusSelectionController(DataModel model) {
        super(model);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        //Initiate the Scene base on the Type of virus chosen (stored in dataModel) from the HomeController
        switch (getDataModel().getType()) {
        case "Enveloped":
            firstVirus = new CoronaVirus();
            secondVirus = new HepatitisBVirus();
            thirdVirus = new HIVVirus();
            break;
        case "Non-Enveloped":
            firstVirus = new RhinoVirus();
            secondVirus = new RotaVirus();
            thirdVirus = new PolioVirus();
            break;
        }

        // Set virus images for ImageViews
        try {
            //Covert from imagePath in String format to URI format that image class can use
            image1.setImage(new Image(Objects.requireNonNull(getClass().getResource(firstVirus.getImagePath())).toURI().toString()));
            image2.setImage(new Image(Objects.requireNonNull(getClass().getResource(secondVirus.getImagePath())).toURI().toString()));
            image3.setImage(new Image(Objects.requireNonNull(getClass().getResource(thirdVirus.getImagePath())).toURI().toString()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        // Set virus names for Labels
        label1.setText(firstVirus.getName());
        label2.setText(secondVirus.getName());
        label3.setText(thirdVirus.getName());
    }

    /**
     * When the user clicks on the virus image, store the user choice to the model and switch to the next scene based on that choice
     *
     * @param event: When user clicks on the virus image
     */
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
            //System.out.println("Error in VirusSelection");

            // In order to use MediaView in javaFX, please add the java.media module in the VM options, or it will throw an error: IllegalAccessError
            //For more detail, check this link: https://www.youtube.com/watch?v=VDTVeDozcag
            loader.setLocation(getClass().getResource("VirusDisplayScene.fxml"));
            loader.setController(new VirusDisplayController(getDataModel()));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
