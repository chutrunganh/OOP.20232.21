package AllJavaCode.virus.component;

public class Capsid extends VirusComponent{

    private String shape; // icosahedral, prolate, helical

    public Capsid(String shape) {
        super("Capsid");
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Capsid:\n\tSHape:" + shape;
    }
    
}
