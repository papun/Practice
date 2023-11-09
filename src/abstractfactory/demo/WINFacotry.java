package src.abstractfactory.demo;

public class WINFacotry implements UIFactory {


    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
