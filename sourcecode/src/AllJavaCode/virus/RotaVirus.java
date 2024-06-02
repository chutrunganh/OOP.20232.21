package AllJavaCode.virus;

public class RotaVirus extends NonEnvelopedVirus{

    public RotaVirus() {
        super("Rotavirus", "RNA", "Icosahedral", "Spherical", 0.07f);
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
