package src.abstractfactory.demo;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Inside Mac Button.");
    }
}
