package application.demonstration.virus.nonenveloped;

public class RhinoVirus extends NonEnvelopedVirus {

    public RhinoVirus() {
        super("Rhinovirus", "RNA", "Icosahedral", "Spherical", 0.03f);
    }

    @Override
    public String getSpreadingMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" spreading methods: ");
        // Provide information
        sb.append("\n\t + Through air (coughing and sneezing)");
        sb.append("\n\t + Through physical contacts (person-to-person, touching contaminated surfaces/objects, etc.)");
        return sb.toString();
    }

    @Override
    public String getCausingDiseases() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diseases/Illnesses caused by ");
        sb.append(getName());
        // Provide information
        sb.append(": The common cold in human.");
        return sb.toString();
    }

    // Override media-acquiring methods to extend addresses with medias' names
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "Rhinovirus.mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "Rhinovirus.png";
    }

}
