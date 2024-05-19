package AllJavaCode.virus.component;

public class LipidEnvelope extends VirusComponent{

    private String anchorType;

    public LipidEnvelope(String anchorType) {
        super("Lipid Envelope");
        this.anchorType = anchorType;
    }

    @Override
    public String toString() {
        return "LipidEnvelope:\n\tGlycoprotein anchors' type: " + anchorType;
    }
}
