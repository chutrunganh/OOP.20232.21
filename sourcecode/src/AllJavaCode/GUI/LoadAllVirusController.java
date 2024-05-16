package AllJavaCode.gui;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.Main;
import AllJavaCode.virus.CoronaVirus;
import AllJavaCode.virus.HIVVirus;
import AllJavaCode.virus.RotaVirus;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class LoadAllVirusController implements Initializable {

    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    public static String chosenVirus; //Store the chosen a specific virus among the all Virus in enveloped/non enveloped Virus

    @FXML
    //Initiate the Label and Image for the virus
    public void initialize() {

        //Initiate the Scene base on the Type of Virus chosen from the HomeController
        if (HomeController.chosenTypeOfVirus.equals("Enveloped")) {
            CoronaVirus coronaVirus = new CoronaVirus();
            HIVVirus hivVirus = new HIVVirus();
            RotaVirus rotaVirus = new RotaVirus();

            label1.setText(coronaVirus.name);
            label2.setText(hivVirus.name);
            label3.setText(rotaVirus.name);
            image1.setImage(new Image(coronaVirus.getImage()));
            image2.setImage(new Image(hivVirus.getImage()));
            image3.setImage(new Image(rotaVirus.getImage()));
        } else {
            System.out.println("Non-Enveloped Virus Chosen");
        }


    }

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
        System.out.println("Corona Virus Clicked");
        chosenVirus = "Corona";

        try {
            Parent root = FXMLLoader.load(getClass().getResource("ASpecificVirusUI.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void HIVClicked(MouseEvent event) {
        System.out.println("HIV Virus Clicked");
        chosenVirus = "HIV";
    }

    @FXML
    void RotaClicked(MouseEvent event) {
        System.out.println("Rota Virus Clicked");
        chosenVirus = "Rota";
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

}
