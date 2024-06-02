package AllJavaCode.virus;

public class PolioVirus extends NonEnvelopedVirus {

    public PolioVirus() {
        super("Poliovirus", "RNA", "Icosahedral", "Spherical", 0.03f);
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
