package AllJavaCode.virus;

public class RotaVirus extends EnvelopedVirus{

    public RotaVirus() {
        super("Rota", "RNA", "Icosahedral", "Spherical", 0.07f, "VP4");
    }

    @Override
    public void showInfectionVideo() {
        System.out.println("Rota Virus infection in video");
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + getName();
    }
}
