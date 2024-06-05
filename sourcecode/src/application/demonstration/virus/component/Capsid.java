package application.demonstration.virus.component;

public class Capsid extends VirusComponent{

    private String shape; // icosahedral, prolate, helical

    public Capsid(String shape) {
        super("Capsid");
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String getSpecifications() {
        return "\tShape: " + shape;
    }

    @Override
    public String getFunctionalities() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t- Protect and deliver the genome (i.e., the nucleic acid)");
        sb.append("\n\t\t- Interact with the host");
        return sb.toString();
    }
    
}
