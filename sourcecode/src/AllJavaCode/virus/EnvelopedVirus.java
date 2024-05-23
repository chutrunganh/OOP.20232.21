package AllJavaCode.virus;

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
    public String showInfectionDescription() {
        return "infection in text";
    }

    @Override
    public void showInfectionVideo() {
        System.out.println("Enveloped Virus infection in video");
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "EnvelopedViruses/";
    }
}