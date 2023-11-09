package src.abstractfactory.demo;

public class MACFactory implements UIFactory {


    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
