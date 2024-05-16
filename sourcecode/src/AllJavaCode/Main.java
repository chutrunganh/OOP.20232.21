package AllJavaCode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


public class Main extends Application {

    public static Scene homeScene;
    //Store the home scene so that we can go back to it later, since evry other scene all have a back button to go back to home scene

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sourcecode/src/AllJavaCode/gui/HomeUI.fxml"));

        homeScene = new Scene(root);

        primaryStage.setTitle("Virus Explorer");
        primaryStage.setScene(homeScene);
        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            event.consume(); // This will prevent the window from closing immediately

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Are you sure you want to exit?");

            if (alert.showAndWait().get() == ButtonType.OK) {
                primaryStage.close(); // This will close the window
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }

}