package AllJavaCode.Virus.AbstractVirus.Component;

/**
 * This class represents the capsid of the virus. A capsid is a protein shell that encloses the viral genome, can
 * be icosahedral, prolate, or helical in shape.
 *
 */
public class Capsid extends VirusComponent {

    private String shape; // icosahedral, prolate, helical

    public Capsid(String shape) {
        super("Capsid");
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String getDetails() {
        String sb = super.getDetails() +
                "\n\tShape: " +
                shape +
                "\n\tFunctions:" +
                "\n\t\t- Protect and deliver the genome (i.e., the nucleic acid)" +
                "\n\t\t- Interact with the host";
        return sb;
    }

}
