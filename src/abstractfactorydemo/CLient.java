package src.abstractfactorydemo;

public class CLient {
    public static void main(String[] args) {
        Application app = new Application(new WINFacotry());
        app.paint();
    }
}
