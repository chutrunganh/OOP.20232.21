package AllJavaCode.virus.component;

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
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDetails());
        sb.append("\n\tType: ");
        sb.append(type);
        sb.append("\n\tFunctions:");
        sb.append("\n\t\t- Store and express genetic information");
        if (type.equals("DNA")) {
            sb.append("\n\t\t- Keeps information that cells require to produce proteins");
        }
        return sb.toString();
    }
}
