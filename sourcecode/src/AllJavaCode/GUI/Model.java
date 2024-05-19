package AllJavaCode.gui;

import AllJavaCode.virus.Virus;

public class Model {

    private final PresentationModel presentationModel = new PresentationModel();
    private Virus selectedVirus; // keep track of selected virus; bind properties to presentation model(?)

    public Model() {

    }

    public void setSelectedVirus(Virus selectedVirus) {
        this.selectedVirus = selectedVirus;
    }

    public PresentationModel getPresentationModel() {
        return presentationModel;
    }
    
    public static class PresentationModel {
        // Try using 2 models: 1 for data storage/management, 1 for passing to UI for display
        
    }



}
