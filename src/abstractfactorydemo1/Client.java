package src.abstractfactorydemo1;

public class Client {
    public static void main(String[] args) {
        Laptop laptop = LaptopFactory.getLaptop(HpLaptop::new);
        System.out.println(laptop.getDescription());
    }
}
