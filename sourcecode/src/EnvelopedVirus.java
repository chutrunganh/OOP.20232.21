// EnvelopedVirus class
public class EnvelopedVirus extends Virus {
    private String glycoprotein;

    public EnvelopedVirus(String name, String structure, String hostCell, String glycoprotein) {
        super(name, structure, hostCell);
        this.glycoprotein = glycoprotein;
    }

    public void attach() {
        System.out.println("Attaching to host cell using glycoprotein...");
    }

    @Override
    public void infect() {
        attach();
        System.out.println("Injecting nucleic acid into host cell...");
    }

    @Override
    public void displayStructure() {
        System.out.println("Displaying structure of Enveloped Virus...");
    }
}