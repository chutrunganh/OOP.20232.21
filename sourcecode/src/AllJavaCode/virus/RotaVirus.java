package AllJavaCode.virus;

public class RotaVirus extends EnvelopedVirus{

    // public RotaVirus() {
    //     super("Rota Virus", "RNA", "Icosahedral", 0.07f, "Spherical", "AllJavaCode/GUI/ImageAndVideo/virus.png", "Enveloped", "VP4");
    // }

    @Override
    public String showInfectionInText() {
        return super.showInfectionInText();
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Rota Virus infection in video");
    }
}
