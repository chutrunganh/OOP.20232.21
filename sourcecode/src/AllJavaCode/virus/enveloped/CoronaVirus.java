package AllJavaCode.virus.enveloped;

public class CoronaVirus extends EnvelopedVirus{

    public CoronaVirus() {
        super("Coronavirus", "RNA", "Helical", "Spherical", 0.12f, "GP120 with spikes");
    }

    @Override
    public String getInfectionDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("- Spreading route(s): ");
        sb.append("Through droplets (present on surfaces/objects) from infected person which contains the virus; ");
        sb.append("enters human body through inhalation.\n");
        sb.append("- Disease/Illness caused: ");
        sb.append("Common cold and respiratory diseases, notably SARS, MERS, and COVID-19.\n");
        sb.append(super.getInfectionDescription());
        return sb.toString();
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
