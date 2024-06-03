package AllJavaCode.virus.nonenveloped;

public class PolioVirus extends NonEnvelopedVirus {

    public PolioVirus() {
        super("Polio", "RNA", "Icosahedral", "Spherical", 0.03f);
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
