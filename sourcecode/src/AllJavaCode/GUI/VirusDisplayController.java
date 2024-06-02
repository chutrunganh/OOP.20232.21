package AllJavaCode.GUI;

import AllJavaCode.Virus.AbstractVirus.Displayable;
import AllJavaCode.Virus.AbstractVirus.EnvelopedVirus;
import AllJavaCode.Virus.AbstractVirus.Infectable;
import AllJavaCode.Virus.AbstractVirus.Virus;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the Virus Display scene
 * Displays the details of the selected virus that user choose from the VirusSelectionScene
 * This VirusDisplayScene has two Tabs. The first tab displays the details of the virus (text+image) and the second tab displays the infection details (text+video)
 */
public class VirusDisplayController extends BaseController {

    @FXML private TextArea virusDetails;
    @FXML private ImageView virusImage;
    @FXML private TextArea infectionDetails;
    @FXML private MediaView infectionVideo;

    //Constructor
    public VirusDisplayController() {
        super();
    }
    public VirusDisplayController(DataModel model) {
        super(model);
    }

    @Override
    public void initialize(URL locations, ResourceBundle resources) {

        //System.out.println("Error in VirusDisplayController.java");

        // Get the selected virus and type from the dataModel
        Virus selectedVirus = getDataModel().getVirus();
        String selectedType = getDataModel().getType();

        // Calling the interface methods for objects. Each object can display its details and image
        Displayable virus, capsid, nucleicAcid;
        virus = selectedVirus;
        capsid = selectedVirus.getCapsid();
        nucleicAcid = selectedVirus.getNucleicAcid();

        //Initialize Image for ImageView
        try {
            virusImage.setImage(new Image(getClass().getResource(virus.getImagePath()).toURI().toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize Virus details
        StringBuilder detailsBuilder = new StringBuilder();
        detailsBuilder.append(virus.getDetails());
        detailsBuilder.append("\n");
        detailsBuilder.append(capsid.getDetails());
        detailsBuilder.append("\n");
        detailsBuilder.append(nucleicAcid.getDetails());
        detailsBuilder.append("\n");
        if (selectedType.equals("Enveloped")) {
            EnvelopedVirus envelopedVirus = (EnvelopedVirus) selectedVirus;
            Displayable envelope = envelopedVirus.getEnvelope();
            detailsBuilder.append(envelope.getDetails());
        }
        virusDetails.setText(detailsBuilder.toString());

        // Initialize infection description and Video
        Infectable infectingVirus = selectedVirus;
        infectionDetails.setText(infectingVirus.getInfectionDescription());

        try {
            System.out.println(infectingVirus.getInfectionVideoPath());
            Media video = new Media(getClass().getResource(infectingVirus.getInfectionVideoPath()).toURI().toString());
            infectionVideo.setMediaPlayer(new MediaPlayer(video));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    Play, Pause, Replay buttons for the infection video
     */
    @FXML
    void playButtonClicked(MouseEvent event) {
        infectionVideo.getMediaPlayer().play();
    }

    @FXML
    void pauseButtonClicked(MouseEvent event) {
        infectionVideo.getMediaPlayer().pause();
    }

    @FXML
    void replayButtonClicked(MouseEvent event) {
        MediaPlayer mediaPlayer = infectionVideo.getMediaPlayer();
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            mediaPlayer.seek(Duration.seconds(0.0));
            mediaPlayer.play();
        }
    }
}