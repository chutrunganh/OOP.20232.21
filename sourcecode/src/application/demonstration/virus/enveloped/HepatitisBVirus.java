package application.demonstration.virus.enveloped;

public class HepatitisBVirus extends EnvelopedVirus {

    public HepatitisBVirus() {
        super("Hepatitis B Virus", "DNA", "Icosahedral", "Spherical", 0.042f, "GP41");
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
    //     sb.append("\n\t + From mother to child at birth");
    //     sb.append("\n\t + Through needlestick injury, tattooing, piercing");
    //     sb.append("\n\t + Through exposure to infected blood and body fluids, as well as sexual activities.\n");
    //     sb.append("- Disease/Illness caused: ");
    //     sb.append("Infections of the liver, leading to potential cirrhosis or liver cancer.\n");
    //     sb.append(super.getInfectionDescription());
    //     return sb.toString();
    // }

}
