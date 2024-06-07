package application.demonstration.virus.enveloped;

public class CoronaVirus extends EnvelopedVirus {

    public CoronaVirus() {
        super("Coronavirus", "RNA", "Helical", "Spherical", 0.12f, "GP120 with spikes");
    }

    @Override
    public String getSpreadingMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" spreading methods: ");
        // Provide information
        sb.append("Through droplets (present on surfaces/objects) from infected person which contains the virus; ");
        sb.append("enters human body through inhalation.");
        return sb.toString();
    }

    @Override
    public String getCausingDiseases() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diseases/Illnesses caused by ");
        sb.append(getName());
        // Provide information
        sb.append(": Common cold and respiratory diseases, notably SARS, MERS, and COVID-19.");
        return sb.toString();
    }

    // Override media-acquiring methods to extend addresses with medias' names
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "Coronavirus.mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "Coronavirus.png";
    }
}
