package AllJavaCode.virus;

public class RotaVirus extends EnvelopedVirus{

    public RotaVirus() {
        super("Rota Virus", "RNA", "Icosahedral", "Spherical", 0.07f, "VP4");
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Rota Virus infection in video");
    }
}
