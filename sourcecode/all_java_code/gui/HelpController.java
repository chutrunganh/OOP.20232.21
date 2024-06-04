package all_java_code.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelpController extends BaseController {

    @FXML TextArea taDetails;

    public HelpController() {
        super();
    }

    public HelpController(DataModel model) {
        super(model);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}
    
}
