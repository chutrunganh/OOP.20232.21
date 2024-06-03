package AllJavaCode.Virus.Component;

/**
 * This class represents the lipid envelope of the Enveloped virus type.
 */
public class Envelope extends VirusComponent {

    private String anchorType;

    public Envelope(String anchorType) {
        super("Lipid Envelope");
        this.anchorType = anchorType;
    }

    @Override
    public String getDetails() {
        String sb = super.getDetails() +
                "\n\tGlycoprotein anchors' structure: " +
                anchorType +
                "\n\tFunction: " +
                "Protect genetic material when travelling between host cells";
        return sb;
    }
}
