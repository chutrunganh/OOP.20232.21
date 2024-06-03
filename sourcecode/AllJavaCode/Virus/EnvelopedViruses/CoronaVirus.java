package AllJavaCode.Virus.EnvelopedViruses;

public class CoronaVirus extends EnvelopedVirus {

    public CoronaVirus() {
        super("Corona", "RNA", "Helical", "Spherical", 0.12f, "GP120 with spikes");
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + getName() + ".mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + getName() + ".png";
    }

}
