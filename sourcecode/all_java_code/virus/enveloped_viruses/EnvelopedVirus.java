package all_java_code.virus.enveloped_viruses;

import all_java_code.virus.component.Envelope;
import all_java_code.virus.Virus;

/**
 * Class for enveloped viruses, extends virus and includes an envelope as new component
 */
public class EnvelopedVirus extends Virus {

    private Envelope envelope;

    public EnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size, String anchorType) {
        super(name, nucleicAcidType, capsidShape, shape, size);
        envelope = new Envelope(anchorType);
    }

    public Envelope getEnvelope() {
        return envelope;
    }

    /*
    virus with envelop usually has anchors, called glycoprotein. The mechanism for
    infecting in this case is by lock – key: when reaching the host cell with the suitable
    outer structure, it uses its glycoproteins to attach, then injects its acid nucleic into the
    cell
     */
    @Override
    public String getInfectionDescription() {
        return "Infection mechanism: The " + getName() + " virus uses its glycoproteins to attach to the host cell (lock-key mechanism), then injects its " + getNucleicAcid().getType() +   " nucleic acid into the cell.";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "enveloped_viruses/"; //Move to image/enveloped_viruses/ folder
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "enveloped_viruses/"; // Move to video/enveloped_viruses/ folder
    }


}