package AllJavaCode.gui;

import java.net.URL;
import java.util.ResourceBundle;

import AllJavaCode.virus.Displayable;
import AllJavaCode.virus.EnvelopedVirus;
import AllJavaCode.virus.Virus;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class VirusDisplayController extends BaseController {

    @FXML private TextArea virusDetails;
    @FXML private ImageView virusImage;
    @FXML private TextArea infectionDetails;
    @FXML private MediaView infectionVideo;

    public VirusDisplayController() {
        super();
    }
    public VirusDisplayController(DataModel model) {
        super(model);
    }

    @Override
    public void initialize(URL locations, ResourceBundle resources) {
        Virus selectedVirus = getDataModel().getVirus();
        String selectedType = getDataModel().getType();

        Displayable virus, capsid, nucleicAcid;
        virus = selectedVirus;
        capsid = selectedVirus.getCapsid();
        nucleicAcid = selectedVirus.getNucleicAcid();

        // Initialize image
        try {
            virusImage.setImage(new Image(getClass().getResource(virus.getImagePath()).toURI().toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Initialize virus details
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
        virusDetails.setEditable(false);

        // Initialize infection description and video
        infectionDetails.setText(selectedVirus.getInfectionDescription());
        infectionDetails.setEditable(false);
        
        try {
            Media video = new Media(getClass().getResource(selectedVirus.getInfectionVideoPath()).toURI().toString());
            infectionVideo.setMediaPlayer(new MediaPlayer(video));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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