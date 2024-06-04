package all_java_code.virus.non_enveloped_viruses;

public class RhinoVirus extends NonEnvelopedVirus {

    public RhinoVirus() {
        super("Rhino", "RNA", "Icosahedral", "Spherical", 0.03f);
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
