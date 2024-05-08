package AllJavaCode.Structure.SpecificVirus;

import AllJavaCode.Structure.AbstractVirus.EnvelopedVirus;

public class CoronaVirus  extends EnvelopedVirus{

    public CoronaVirus() {
        super("Corona Virus", "RNA", "Helical", 0.1f, "Spherical", "CoronaVirus.jpg", "Enveloped", "Spike Glycoprotein");
    }

    @Override
    public String showInfectionInText() {
        return super.showInfectionInText();
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Corona Virus infection in video");
    }

}
