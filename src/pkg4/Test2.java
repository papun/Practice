package src.pkg4;

public class Test2 {
    public static void main(String[] args) {
        HashMapCustom custom = new HashMapCustom();

        custom.put(1, 1);
        custom.put(2, 5);
        custom.put(3, 1);
        custom.put(4, 5);
        custom.put(5, 1);
        custom.put(6, 5);
        custom.display();
        System.out.println();
        LinkedHashMapCustom custom1 = new LinkedHashMapCustom<>();
        custom1.put(1, 1);
        custom1.put(2, 5);
        custom1.put(3, 1);
        custom1.put(4, 5);
        custom1.put(5, 1);
        custom1.put(6, 5);
        custom1.display();
    }
}
