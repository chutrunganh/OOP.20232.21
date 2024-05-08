package AllJavaCode.Structure.SpecificVirus;
import AllJavaCode.Structure.AbstractVirus.EnvelopedVirus;

public class RotaVirus extends EnvelopedVirus{

    public RotaVirus() {
        super("Rota Virus", "RNA", "Icosahedral", 0.07f, "Spherical", "RotaVirus.jpg", "Enveloped", "VP4");
    }

    @Override
    public String showInfectionInText() {
        return super.showInfectionInText();
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Rota Virus infection in video");
    }
}
