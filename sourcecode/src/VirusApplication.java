// VirusApplication class
public class VirusApplication {
    private String title;
    private Virus virus;

    public VirusApplication(String title) {
        this.title = title;
    }

    public void start() {
        System.out.println("Starting application...");
    }

    public void quit() {
        System.out.println("Quitting application...");
    }

    public void selectVirus(Virus v) {
        this.virus = v;
        System.out.println("Selected virus: " + v.getClass().getSimpleName());
    }
}