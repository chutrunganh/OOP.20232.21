// Abstract Virus class
public abstract class Virus implements Infectable {
    protected String name;
    protected String structure;
    protected String hostCell;

    public Virus(String name, String structure, String hostCell) {
        this.name = name;
        this.structure = structure;
        this.hostCell = hostCell;
    }

    public abstract void displayStructure();
}