package application.demonstration.virus.nonenveloped;

public class RotaVirus extends NonEnvelopedVirus{

    public RotaVirus() {
        super("Rotavirus", "RNA", "Icosahedral", "Spherical", 0.07f);
    }

    @Override
    public String getSpreadingMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" spreading methods: ");
        // Provide information
        sb.append("\n\t + Through air (coughing and sneezing)");
        sb.append("\n\t + Through hand-to-mouth contacts with feces containing the virus and hand contacts in closed environments.");
        return sb.toString();
    }

    @Override
    public String getCausingDiseases() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diseases/Illnesses caused by ");
        sb.append(getName());
        // Provide information
        sb.append(": Diarrhea (especially in children) and stomach flu.");
        return sb.toString();
    }

    // Override media-acquiring methods to extend addresses with medias' names
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "Rotavirus.mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "Rotavirus.png";
    }

}
