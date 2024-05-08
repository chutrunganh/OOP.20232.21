package AllJavaCode.GUI;

import AllJavaCode.Main;
import AllJavaCode.Structure.SpecificVirus.CoronaVirus;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CoronaVirusController {

    @FXML
    private TextField tfVirusInfo;
    public static CoronaVirus coronaVirus;

    public void initialize() {
        coronaVirus = new CoronaVirus();
        String virusInfo = coronaVirus.showInfectionInText();
        tfVirusInfo.setText(virusInfo);
    }

    @FXML
    void backToHomeClicked(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(Main.homeScene);
    }

}
