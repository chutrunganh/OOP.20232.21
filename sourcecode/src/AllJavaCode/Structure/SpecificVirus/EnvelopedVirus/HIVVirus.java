package AllJavaCode.Structure.SpecificVirus.EnvelopedVirus;
import AllJavaCode.Structure.AbstractVirus.EnvelopedVirus;

public class HIVVirus extends EnvelopedVirus{
    public HIVVirus() {
        super("HIV Virus", "RNA", "Icosahedral", 0.1f, "Spherical", "AllJavaCode/GUI/ImageAndVideo/hepatitis-b.png", "Enveloped", "GP120");
    }

    @Override
    public String showInfectionInText() {
        return super.showInfectionInText();
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("HIV Virus infection in video");
    }

}
