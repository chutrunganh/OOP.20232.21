package AllJavaCode.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import AllJavaCode.virus.Virus;

public class Model {

    private Parent homeRoot, selectVirusRoot, displayVirusRoot;
    private Virus selectedVirus; // keep track of selected virus; bind properties to presentation model(?)

    public Model() throws Exception{
        homeRoot = FXMLLoader.load(getClass().getResource("gui/HomeUI.fxml"));
        selectVirusRoot = FXMLLoader.load(getClass().getResource("gui/LoadAllVirusUI.fxml"));
        displayVirusRoot = FXMLLoader.load(getClass().getResource("gui/ASpecificVirusUI.fxml"));
        // Change names of .fxml files


    }
    public Parent getRoot(String scene) throws Exception{
        switch (scene) {
        case "Home": return homeRoot;
        case "SelectVirus": return selectVirusRoot;
        case "DisplayVirus": return displayVirusRoot;
        default: throw new Exception("Invalid Scene name/identity");
        }
    }

    public void setSelectedVirus(Virus selectedVirus) {
        this.selectedVirus = selectedVirus;
    }
    
    public static class PresentationModel {
        // Try using 2 models: 1 for data storage/management, 1 for passing to UI for display
        
    }



}
