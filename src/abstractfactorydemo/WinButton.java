package src.abstractfactorydemo;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Inside Window Button.");
    }
}
