package application.demonstration.virus.enveloped;

public class HepatitisBVirus extends EnvelopedVirus {

    public HepatitisBVirus() {
        super("Hepatitis B Virus", "DNA", "Icosahedral", "Spherical", 0.042f, "GP41");
    }

    @Override
    public String getSpreadingMethods() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" spreading methods: ");
        // Provide information
        sb.append("\n\t + From mother to child at birth");
        sb.append("\n\t + Through needlestick injury, tattooing, piercing");
        sb.append("\n\t + Through exposure to infected blood and body fluids, as well as sexual activities.");
        return sb.toString();
    }

    @Override
    public String getCausingDiseases() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diseases/Illnesses caused by ");
        sb.append(getName());
        // Provide information
        sb.append(": Infections of the liver, leading to potential cirrhosis or liver cancer.");
        return sb.toString();
    }

    // Override media-acquiring methods to extend addresses with medias' names
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "HepatitisB.mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "HepatitisB.png";
    }

}
