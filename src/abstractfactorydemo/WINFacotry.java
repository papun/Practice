package src.abstractfactorydemo;

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
