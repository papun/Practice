package src.abstractfactory;

public class AndroidDevFactory extends EmpAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
