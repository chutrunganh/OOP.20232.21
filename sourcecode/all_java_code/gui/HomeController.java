package all_java_code.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the Home scene
 * Allows user to choose between enveloped and non-enveloped viruses by clicking on the respective image
 */
public class HomeController extends BaseController {


    //Constructor
    public HomeController() {
        super();
    }

    public HomeController(DataModel model) {
        super(model);
    }

    @Override
    // Since HomeController extends BaseController, it must either be declared abstract or implement
    // abstract method 'initialize(URL, ResourceBundle)' in 'Initializable'
    public void initialize(URL location, ResourceBundle resources) {}


    /**
     * When the user clicks on the enveloped/non enveloped virus button, store the user choice to the model and switch to the next scene based on that choice
     *
     * @param event: When user clicks on the enveloped/non enveloped virus image
     */
    @FXML
    void envelopedVirusClicked(MouseEvent event) {
        getDataModel().setType("Enveloped"); // store user choice to the model
        switchNextScene(event);
    }

    @FXML
    void nonEnvelopedVirusClicked(MouseEvent event) {
        getDataModel().setType("Non-Enveloped");
        switchNextScene(event);
    }

    void switchNextScene(MouseEvent event) {
        // switch to virus selection
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("VirusSelectionScene.fxml"));
            loader.setController(new VirusSelectionController(getDataModel())); // pass the model to the next controller, the next scene will base
            // on the user choice stored in the model to display the corresponding content
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
