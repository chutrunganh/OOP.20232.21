package application.demonstration;

import application.demonstration.Main;

public class MainToPackage {
    /**
     * This class is used to run the main method in the Main class without
     * extends Application inorder to build the jar file
     * @param args
     */
    public static void main(String[] args) {
        Main.main(args);
    }
}