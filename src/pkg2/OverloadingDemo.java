package src.pkg2;

public class OverloadingDemo {
     void print(Object obj) { System.out.println("Object");}

    void print(String str) { System.out.println("String") ; }

    public static void main(String[] args) {
        new OverloadingDemo().print(null);
    }
}


