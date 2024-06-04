package AllJavaCode.virus.nonenveloped;

public class PolioVirus extends NonEnvelopedVirus {

    public PolioVirus() {
        super("Poliovirus", "RNA", "Icosahedral", "Spherical", 0.03f);
    }

    @Override
    public String getInfectionDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("- Spreading route(s): ");
        sb.append("Person-to-person, through fecal-oral, share of water/food, or multiplies in the intestine.\n");
        sb.append("- Disease/Illness caused: ");
        sb.append("Polio, causing inability to move body parts such as legs, necks, or internal organs.\n");
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
