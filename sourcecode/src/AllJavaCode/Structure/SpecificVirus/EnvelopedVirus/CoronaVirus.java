package AllJavaCode.Structure.SpecificVirus.EnvelopedVirus;

import AllJavaCode.Structure.AbstractVirus.EnvelopedVirus;

public class CoronaVirus  extends EnvelopedVirus{
    public CoronaVirus() {
        super("Corona Virus", "RNA", "Helical", 0.1f, "Spherical", "AllJavaCode/GUI/ImageAndVideo/Corona Virus.png", "Enveloped", "Spike Glycoprotein");
    }

    @Override
    public String showInfectionInText() {
        return super.showInfectionInText();
    }
    @Override
    public String showInfectionInVideo() {
        return super.showInfectionInVideo();
    }
}
