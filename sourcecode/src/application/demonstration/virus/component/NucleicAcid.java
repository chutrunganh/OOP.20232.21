package application.demonstration.virus.component;

public class NucleicAcid extends VirusComponent{

    private String type; // DNA or RNA

    public NucleicAcid(String type) {
        super("Acid Nucleic");
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getSpecifications() {
        return "\tType: " + type;
    }

    @Override
    public String getFunctionalities() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t- Store and express genetic information");
        if (type.equals("DNA")) {
            sb.append("\n\t\t- Keeps information that cells require to produce proteins");
        }
        return sb.toString();
    }

}
