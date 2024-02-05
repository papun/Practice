package src.factorypattern;

public class OSFactory {
    public OS getDetails(String type) {
        if ("windows".equalsIgnoreCase(type))
            return new WindowsOS();
        else if ("mac".equalsIgnoreCase(type))
            return new MACOS();
        else return null;
    }
}
