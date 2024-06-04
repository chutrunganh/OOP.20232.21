package application.demonstration.virus.enveloped;

public class HepatitisBVirus extends EnvelopedVirus{

    public HepatitisBVirus() {
        super("Hepatitis B Virus", "DNA", "Icosahedral", "Spherical", 0.042f, "GP41");
    }

    @Override
    public String getInfectionDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("- Spreading route(s): ");
        sb.append("\n\t + From mother to child at birth");
        sb.append("\n\t + Through needlestick injury, tattooing, piercing");
        sb.append("\n\t + Through exposure to infected blood and body fluids, as well as sexual activities.\n");
        sb.append("- Disease/Illness caused: ");
        sb.append("Infections of the liver, leading to potential cirrhosis or liver cancer.\n");
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
