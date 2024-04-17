// NonEnvelopedVirus class
public class NonEnvelopedVirus extends Virus {
    private String capsid;

    public NonEnvelopedVirus(String name, String structure, String hostCell, String capsid) {
        super(name, structure, hostCell);
        this.capsid = capsid;
    }

    public void dissolveCapsid() {
        System.out.println("Dissolving capsid...");
    }

    @Override
    public void infect() {
        dissolveCapsid();
        System.out.println("Injecting nucleic acid into host cell...");
    }

    @Override
    public void displayStructure() {
        System.out.println("Displaying structure of Non-Enveloped Virus...");
    }
}