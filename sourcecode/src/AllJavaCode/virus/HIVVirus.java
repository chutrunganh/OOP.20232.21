package AllJavaCode.virus;

public class HIVVirus extends EnvelopedVirus{
    
    public HIVVirus() {
        super("HIV", "RNA", "Icosahedral",  "Spherical", 0.1f, "GP120");
    }

    @Override
    public void showInfectionVideo() {
        System.out.println("HIV Virus infection in video");
    }

    @Override
    public String getImagePath() {
        return "image/hepatitis-b.png";
    }
}
