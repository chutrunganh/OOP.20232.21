package AllJavaCode.Virus.NonEnvelopedViruses;

public class RotaVirus extends NonEnvelopedVirus {

    public RotaVirus() {
        super("Rota", "RNA", "Icosahedral", "Spherical", 0.07f);
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
