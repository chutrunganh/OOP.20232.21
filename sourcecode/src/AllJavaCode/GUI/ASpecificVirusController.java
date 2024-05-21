package AllJavaCode.GUI;

import AllJavaCode.Main;
import AllJavaCode.Structure.SpecificVirus.EnvelopedVirus.CoronaVirus;
import AllJavaCode.Structure.SpecificVirus.EnvelopedVirus.HIVVirus;
import AllJavaCode.Structure.SpecificVirus.NonEnvelopedVirus.RotaVirus;
import javafx.fxml.FXML;
import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.ImageView;

public class ASpecificVirusController {

    @FXML
    private TextArea taVirusInfo;
    @FXML
    private ImageView virusImage;
    @FXML
    private TextArea taVirusInfectMechanism;
    @FXML
    private MediaView mediaView;
    @FXML
    private Button playButton, pauseButton, replayButton;
    private File file;
    private MediaPlayer mediaPlayer;

    public void initialize(){
       //Initiate base on the Virus chosen
        if (LoadAllVirusController.chosenVirus.equals("Corona")) {
            CoronaVirus coronaVirus = new CoronaVirus();
            taVirusInfo.setText(coronaVirus.toString());
            virusImage.setImage(new Image(coronaVirus.getImage()));
            taVirusInfectMechanism.setText(coronaVirus.showInfectionInText());
            file = new File(coronaVirus.showInfectionInVideo());
        }
        else if (LoadAllVirusController.chosenVirus.equals("HIV")) {
            HIVVirus hivVirus = new HIVVirus();
            taVirusInfo.setText(hivVirus.toString());
            virusImage.setImage(new Image(hivVirus.getImage()));
            taVirusInfectMechanism.setText(hivVirus.showInfectionInText());
            file = new File(hivVirus.showInfectionInVideo());
        }
        else if (LoadAllVirusController.chosenVirus.equals("Rota")) {
            RotaVirus rotaVirus = new RotaVirus();
            taVirusInfo.setText(rotaVirus.toString());
            virusImage.setImage(new Image(rotaVirus.getImage()));
            taVirusInfectMechanism.setText(rotaVirus.showInfectionInText());
            file = new File(rotaVirus.showInfectionInVideo());
        }
        Media media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        taVirusInfectMechanism.setEditable(false);
        taVirusInfo.setEditable(false);

    }
    public void playMedia(){
        mediaPlayer.play();
    }
    public void pauseMedia(){
        mediaPlayer.pause();
    }
    public void replayMedia(){
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            mediaPlayer.seek(Duration.seconds(0.0));
            mediaPlayer.play();
        }
    }

    @FXML
    void backToHomeClicked(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(Main.homeScene);
    }
}
