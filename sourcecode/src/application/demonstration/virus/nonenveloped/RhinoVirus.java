package application.demonstration.virus.nonenveloped;

public class RhinoVirus extends NonEnvelopedVirus {

    public RhinoVirus() {
        super("Rhinovirus", "RNA", "Icosahedral", "Spherical", 0.03f);
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
    //     sb.append("\n\t + Through physical contacts (person-to-person, touching contaminated surfaces/objects, etc.) \n");
    //     sb.append("- Disease/Illness caused: ");
    //     sb.append("The common cold in human.\n");
    //     sb.append(super.getInfectionDescription());
    //     return sb.toString();
    // }

}
