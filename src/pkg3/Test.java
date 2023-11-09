package src.pkg3;

class Animal {
    void bark() {
        System.out.println("Animal Barking...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barking...");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.bark();


    }
}
