package AllJavaCode.virus;

public class HIVVirus extends EnvelopedVirus{
    
    public HIVVirus() {
        super("HIV Virus", "RNA", "Icosahedral",  "Spherical", 0.1f, "GP120");
    }

    @Override
    public void showInfectionVideo() {
        System.out.println("HIV Virus infection in video");
    }

}
