package application.demonstration.virus.enveloped;

import application.demonstration.virus.Virus;
import application.demonstration.virus.component.Envelope;

public abstract class EnvelopedVirus extends Virus {

    private Envelope envelope;

    public EnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size, String anchorType) {
        super(name, nucleicAcidType, capsidShape, shape, size);
        envelope = new Envelope(anchorType);
    }

    public Envelope getEnvelope() {
        return envelope;
    }
    
    /*
    Virus with envelop usually has anchors, called glycoprotein. The mechanism for
    infecting in this case is by lock – key: when reaching the host cell with the suitable
    outer structure, it uses its glycoproteins to attach, then injects its acid nucleic into the
    cell
     */
    @Override
    public String getInfectionMechanism() {
        StringBuilder sb = new StringBuilder();
        sb.append("Infection mechanism: ");
        sb.append(getName());
        sb.append(" uses its glycoproteins to attach to the host cell (called the lock-key mechanism), then injects its ");
        sb.append(getNucleicAcid().getType());
        sb.append(" into the cell");
        return sb.toString();
    }

    // Extend addresses to directories of medias for enveloped viruses
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "EnvelopedViruses/";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "EnvelopedViruses/";
    }
}