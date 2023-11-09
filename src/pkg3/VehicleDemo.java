package src.pkg3;

interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Engine Started...");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v = () -> System.out.println("Engine Started");
        v.start();


    }
}