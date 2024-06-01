package AllJavaCode.virus;

public class CoronaVirus extends EnvelopedVirus{

    public CoronaVirus() {
        super("Corona", "RNA", "Helical", "Spherical", 0.1f, "GP120");
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
