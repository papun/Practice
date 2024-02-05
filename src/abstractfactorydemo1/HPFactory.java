package src.abstractfactorydemo1;

public class HPFactory implements LaptopAbstractFactory {

    @Override
    public Laptop createLaptop() {
        return new HpLaptop();
    }
}
