package AllJavaCode.GUI;

import AllJavaCode.Virus.EnvelopedViruses.EnvelopedVirus;
import AllJavaCode.Virus.Virus;

public class DataModel {

    private Virus selectedVirus = new EnvelopedVirus("", "", "", "", 0, ""); // keep track of selected Virus; bind properties to presentation model(?)
    private String selectedType = ""; // non-enveloped or enveloped

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
