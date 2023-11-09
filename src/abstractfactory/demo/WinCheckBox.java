package src.abstractfactory.demo;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Inside Win checkbox.");
    }
}
