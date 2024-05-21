package AllJavaCode.Structure.SpecificVirus.EnvelopedVirus;
import AllJavaCode.Structure.AbstractVirus.EnvelopedVirus;

public class HIVVirus extends EnvelopedVirus{
    public HIVVirus() {
        super("HIV Virus", "RNA", "Icosahedral", 0.1f, "Spherical", "AllJavaCode/GUI/ImageAndVideo/HIV Virus.jpg", "Enveloped", "GP120");
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
