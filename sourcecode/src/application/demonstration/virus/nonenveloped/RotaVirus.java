package application.demonstration.virus.nonenveloped;

public class RotaVirus extends NonEnvelopedVirus{

    public RotaVirus() {
        super("Rotavirus", "RNA", "Icosahedral", "Spherical", 0.07f);
    }

    @Override
    public String getSpreadingMethods() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpreadingMethods'");
    }

    @Override
    public String getCausingDiseases() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCausingDiseases'");
    }

    // @Override
    // public String getInfectionDescription() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("- Spreading route(s): ");
    //     sb.append("\n\t + Through air (coughing and sneezing)");
    //     sb.append("\n\t + Through hand-to-mouth contacts with feces containing the virus and hand contacts in closed environments.\n");
    //     sb.append("- Disease/Illness caused: ");
    //     sb.append("Diarrhea (especially in children) and stomach flu.\n");
    //     sb.append(super.getInfectionDescription());
    //     return sb.toString();
    // }

}
