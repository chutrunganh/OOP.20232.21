package AllJavaCode.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.virus.Displayable;
import AllJavaCode.virus.EnvelopedVirus;
import AllJavaCode.virus.Virus;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    @FXML private Button helpButton;
    @FXML private TextArea taVirusInfectMechanism;
    private DataModel model;

    public ASpecificVirusController() {
        this.model = new DataModel();
    }
    public ASpecificVirusController(DataModel model) {
        this.model = model;
    }

    public void initialize(URL locations, ResourceBundle resources) {
        Virus selectedVirus = model.getVirus();
        Displayable virus, capsid, nucleicAcid, envelope;
        virus = selectedVirus;
        capsid = selectedVirus.getCapsid();
        nucleicAcid = selectedVirus.getNucleicAcid();
        
        // Initialize image
        try {
            virusImage.setImage(new Image(getClass().getResource(virus.getImagePath()).toURI().toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize virus details
        StringBuilder detailsBuilder = new StringBuilder();
        detailsBuilder.append(virus.getDetails());
        detailsBuilder.append("\n");
        detailsBuilder.append(capsid.getDetails());
        detailsBuilder.append("\n");
        detailsBuilder.append(nucleicAcid.getDetails());
        detailsBuilder.append("\n");
        if (selectedVirus instanceof EnvelopedVirus) {
            EnvelopedVirus envelopedVirus = (EnvelopedVirus) selectedVirus;
            envelope = envelopedVirus.getEnvelope();
            detailsBuilder.append(envelope.getDetails());
        }
        taVirusInfo.setText(detailsBuilder.toString());

        // Initialize infection description
        
    }

    @FXML
    void homeButtonClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("HomeUI.fxml"));
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

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // System.out.println("Help button clicked.");
    }
    
}
