package AllJavaCode.Structure.SpecificVirus.NonEnvelopedVirus;
import AllJavaCode.Structure.AbstractVirus.NonEnvelopedVirus;

public class RotaVirus extends NonEnvelopedVirus{

    public RotaVirus() {
        super("Rota Virus", "RNA", "Icosahedral", 0.07f, "Spherical", "AllJavaCode/GUI/ImageAndVideo/Rota Virus.png");
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
