package AllJavaCode.gui;

import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.Main;
import AllJavaCode.virus.CoronaVirus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ASpecificVirusController implements Initializable{

    @FXML
    private TextArea taVirusInfo;
    @FXML
    private ImageView virusImage;
    @FXML private ImageView homeButton;
    @FXML
    private TextArea taVirusInfectMechanism;

    public void initialize(URL locations, ResourceBundle resources) {
       //Initiate base on the Virus chosen
        if (LoadAllVirusController.chosenVirus.equals("Corona")) {
            CoronaVirus coronaVirus = new CoronaVirus();
            taVirusInfo.setText(coronaVirus.toString());
            virusImage.setImage(new Image(coronaVirus.getImage()));
            taVirusInfectMechanism.setText(coronaVirus.showInfectionInText());
        }
        else if (LoadAllVirusController.chosenVirus.equals("HIV")) {
            System.out.println("HIV Virus Chosen");
        }
        else if (LoadAllVirusController.chosenVirus.equals("Rota")) {
            System.out.println("Rota Virus Chosen");

        }
    }

    @FXML
    void backToHomeClicked(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(Main.homeScene);
    }

}
