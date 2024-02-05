package src.abstractfactorydemo1;

public class LaptopFactory {

    public static Laptop getLaptop(LaptopAbstractFactory laptopAbstractFactory) {
        return laptopAbstractFactory.createLaptop();
    }
}
