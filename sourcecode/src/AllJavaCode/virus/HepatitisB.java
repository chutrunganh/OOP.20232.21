package AllJavaCode.virus;

public class HepatitisB extends EnvelopedVirus{

    public HepatitisB() {
        super("Hepatitis B", "DNA", "Icosahedral", "Spherical", 0.042f, "GP41");
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
