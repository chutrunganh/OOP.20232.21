package AllJavaCode.virus;

public class CoronaVirus extends EnvelopedVirus{

    public CoronaVirus() {}
    // public CoronaVirus() {
    //     super("Corona Virus", "RNA", "Helical", 0.1f, "Spherical", "AllJavaCode/GUI/ImageAndVideo/coronavirus.png", "Enveloped", "Spike Glycoprotein");
    // }

    @Override
    public String showInfectionInText() {
        return super.showInfectionInText();
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Corona Virus infection in video");
    }
}