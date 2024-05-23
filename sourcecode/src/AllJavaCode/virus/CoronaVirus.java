package AllJavaCode.virus;

public class CoronaVirus extends EnvelopedVirus{

    public CoronaVirus() {
        super("Corona", "RNA", "Helical", "Spherical", 0.1f, "Spike Glycoprotein");
    }

    @Override
    public void showInfectionVideo() {
        System.out.println("Corona Virus infection in video");
    }

}
