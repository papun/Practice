package src.abstractfactory.demo;

public class CLient {
    public static void main(String[] args) {
        Application app = new Application(new WINFacotry());
        app.paint();
    }
}
