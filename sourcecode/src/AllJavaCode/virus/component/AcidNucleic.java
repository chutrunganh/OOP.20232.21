package AllJavaCode.virus.component;

public class AcidNucleic extends VirusComponent{

    private String type; // DNA or RNA

    public AcidNucleic(String type) {
        super("Acid Nucleic");
        this.type = type;
    }

    @Override
    public String toString() {
        return "Acid Nucleic:\n\tType: " + type;
    }
}
