package application.demonstration.virus.enveloped;

public class HIVVirus extends EnvelopedVirus {
    
    public HIVVirus() {
        super("HIV", "RNA", "Icosahedral",  "Spherical", 0.1f, "GP120");
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
    //     sb.append("\n\t + Through breast milk, and a small chance from mother to child at birth");
    //     sb.append("\n\t + Through needlestick injury, tattooing, piercing");
    //     sb.append("\n\t + Through exposure to infected blood and body fluids (except saliva), as well as sexual activities.\n");
    //     sb.append("- Disease/Illness caused: ");
    //     sb.append("Damages the human immune system, leading to AIDS.\n");
    //     sb.append(super.getInfectionDescription());
    //     return sb.toString();
    // }

}
