package all_java_code;

import all_java_code.gui.DataModel;
import all_java_code.gui.HomeController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Procedure for loading a new scene and setting a customized FXML Controller
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("gui/HomeScene.fxml"));
            loader.setController(new HomeController(new DataModel()));
            primaryStage.setResizable(false);
            primaryStage.setTitle("virus Demonstration");
            primaryStage.setScene(new Scene(loader.load()));

            // Set the icon of the application
            primaryStage.getIcons().add(new Image("all_java_code/gui/image/appIcon1.png"));

            primaryStage.setOnCloseRequest(event -> {
                event.consume(); // This will prevent the window from closing immediately

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText("Are you sure you want to exit?");

                if (alert.showAndWait().get() == ButtonType.OK) {
                    primaryStage.close(); // This will close the window
                }
            });
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        launch(args);
    }

}