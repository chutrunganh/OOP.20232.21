package application.demonstration.virus.nonenveloped;

public class PolioVirus extends NonEnvelopedVirus {

    public PolioVirus() {
        super("Poliovirus", "RNA", "Icosahedral", "Spherical", 0.03f);
    }

    @Override
    public String getSpreadingMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" spreading methods: ");
        // Provide information
        sb.append("Person-to-person, through fecal-oral, share of water/food, or multiplies in the intestine.");
        return sb.toString();
    }

    @Override
    public String getCausingDiseases() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diseases/Illnesses caused by ");
        sb.append(getName());
        // Provide information
        sb.append(": Polio, causing inability to move body parts such as legs, necks, or internal organs.");
        return sb.toString();
    }

    // Override media-acquiring methods to extend addresses with medias' names
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "Poliovirus.mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "Poliovirus.png";
    }

}
