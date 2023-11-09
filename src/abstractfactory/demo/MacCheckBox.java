package src.abstractfactory.demo;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Inside Mac Checkbox.");
    }
}
