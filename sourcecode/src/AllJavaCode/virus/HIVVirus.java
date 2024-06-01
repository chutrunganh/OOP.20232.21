package AllJavaCode.virus;

public class HIVVirus extends EnvelopedVirus{
    
    public HIVVirus() {
        super("HIV", "RNA", "Icosahedral",  "Spherical", 0.1f, "GP120");
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + getName();
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + getName() + ".png";
    }
}
