package application.demonstration.virus.component;

public class Envelope extends VirusComponent{

    private String anchorType;

    public Envelope(String anchorType) {
        super("Lipid Envelope");
        this.anchorType = anchorType;
    }

    @Override
    public String getSpecifications() {
        return "\tType of glycoprotein anchors: " + anchorType;
    }

    @Override
    public String getFunctionalities() {
        return "Protect genetic material when travelling between host cells";
    }

}
