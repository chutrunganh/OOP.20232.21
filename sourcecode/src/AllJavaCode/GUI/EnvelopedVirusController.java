package AllJavaCode.GUI;
import AllJavaCode.Main;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;


public class EnvelopedVirusController {


    @FXML

    //DO NOT do like this, this is create a new HomeUI instance instead of go back to previous HomeUI
    // void backToHomeClicked(MouseEvent event) {
    // try {
    //     Parent root = FXMLLoader.load(getClass().getResource("HomeUI.fxml"));
    //     Scene scene = new Scene(root);
    //     Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    //     stage.setScene(scene);
    //     stage.show();
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }

    void backToHomeClicked(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(Main.homeScene);
    }

    @FXML
    void CoronaClicked(MouseEvent event) {

    }

    @FXML
    void HIVClicked(MouseEvent event) {

    }

    @FXML
    void RotaClicked(MouseEvent event) {

    }

}
