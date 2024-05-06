package GUI;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    void EnvelopedVirusClicked(MouseEvent event) {
        System.out.println("Enveloped Virus Clicked");
    }

    @FXML
    void NonEnvelopedVirusClicked(MouseEvent event) {
        System.out.println("Non-Enveloped Virus Clicked");
    }

}
