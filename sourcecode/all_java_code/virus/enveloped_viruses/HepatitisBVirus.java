package all_java_code.virus.enveloped_viruses;

public class HepatitisBVirus extends EnvelopedVirus {

    public HepatitisBVirus() {
        super("HepatitisB", "DNA", "Icosahedral", "Spherical", 0.042f, "GP41");
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
