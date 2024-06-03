package AllJavaCode.virus.enveloped;

import AllJavaCode.virus.Virus;
import AllJavaCode.virus.component.Envelope;

public class EnvelopedVirus extends Virus {

    private Envelope envelope;

    public EnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size, String anchorType) {
        super(name, nucleicAcidType, capsidShape, shape, size);
        envelope = new Envelope(anchorType);
    }

    public Envelope getEnvelope() {
        return envelope;
    }
    
    @Override
    public String getInfectionDescription() {
        return "infection in text";
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "EnvelopedViruses/";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "EnvelopedViruses/";
    }
}