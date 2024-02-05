package src.abstractfactorydemo1;

public class DellFactory implements LaptopAbstractFactory {
    @Override
    public Laptop createLaptop() {
        return new DellLaptop();
    }
}
