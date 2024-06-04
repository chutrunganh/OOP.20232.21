package application.demonstration.virus.component;

public class Envelope extends VirusComponent{

    private String anchorType;

    public Envelope(String anchorType) {
        super("Lipid Envelope");
        this.anchorType = anchorType;
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDetails());
        sb.append("\n\tGlycoprotein anchors' structure: ");
        sb.append(anchorType);
        sb.append("\n\tFunction: ");
        sb.append("Protect genetic material when travelling between host cells");
        return sb.toString();
    }
}
