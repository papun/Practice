package src.factorypattern;

public class Client {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        String detail = osFactory.getDetails("macj").getDetails();
        System.out.println(detail);
    }
}
