package application.demonstration.virus.enveloped;

public class HIVVirus extends EnvelopedVirus {
    
    public HIVVirus() {
        super("HIV", "RNA", "Icosahedral",  "Spherical", 0.1f, "GP120");
    }

    @Override
    public String getSpreadingMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" spreading methods: ");
        // Provide information
        sb.append("\n\t + Through breast milk, and a small chance from mother to child at birth");
        sb.append("\n\t + Through needlestick injury, tattooing, piercing");
        sb.append("\n\t + Through exposure to infected blood and body fluids (except saliva), as well as sexual activities.");
        return sb.toString();
    }

    @Override
    public String getCausingDiseases() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diseases/Illnesses caused by ");
        sb.append(getName());
        // Provide information
        sb.append(": Damages the human immune system, leading to AIDS.");
        return sb.toString();
    }

    // Override media-acquiring methods to extend addresses with medias' names
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "HIV.mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "HIV.png";
    }

}
