package AllJavaCode.gui;

import AllJavaCode.virus.Virus;

public class DataModel {

    private Virus selectedVirus; // keep track of selected virus; bind properties to presentation model(?)
    private String selectedType; // non-enveloped or enveloped

    public void setVirus(Virus selectedVirus) {
        this.selectedVirus = selectedVirus;
    }

    public Virus getVirus() {
        return selectedVirus;
    }

    public void setType(String type) {
        this.selectedType = type;
    }

    public String getType() {
        return selectedType;
    }

}
