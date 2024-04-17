public class Main {
    public static void main(String[] args) {
        VirusApplication app = new VirusApplication("Virus Simulation");

        // Create an EnvelopedVirus instance
        Virus influenza = new EnvelopedVirus("Influenza", "Spherical", "Human Cell", "Hemagglutinin");
        app.selectVirus(influenza);
        app.start();
        influenza.infect();
        influenza.displayStructure();


        System.out.println("----------------------------------------");

        // Create a NonEnvelopedVirus instance
        Virus polio = new NonEnvelopedVirus("Polio", "Icosahedral", "Human Cell", "Capsid Protein VP1");
        app.selectVirus(polio);
        polio.infect();
        polio.displayStructure();

        app.quit();
    }
}