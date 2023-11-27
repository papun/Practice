package src.abstractfactory;

public class WebDevFactory extends EmpAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
