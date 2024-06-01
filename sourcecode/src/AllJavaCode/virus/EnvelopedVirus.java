package AllJavaCode.virus;

import AllJavaCode.virus.component.LipidEnvelope;

public class EnvelopedVirus extends Virus {

    public LipidEnvelope envelope;

    public EnvelopedVirus(String name, String acidNucleicType, String capsidShape, String shape, float size, String anchorType) {
        super(name, acidNucleicType, capsidShape, shape, size);
        envelope = new LipidEnvelope(anchorType);
    }

    @Override
    public String showInfectionInText() {
        return "infection in text";
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Enveloped Virus infection in video");
    }

    @Override
    public String getImagePath() {
        return "sourcecode/src/AllJavaCode/gui/image/EnvelopedVirus/" + getName();
    }
}