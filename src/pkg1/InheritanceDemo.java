package src.pkg1;

class A{
    public void show(){
        System.out.println("Inside A show()");
    }

    public static void print(){
        System.out.println("Hello");
    }
}
class B extends A{
    @Override
    public void show() {
        System.out.println("Inside B show()");
    }
    public void dontshow(){
        System.out.println("Inside B dontshow()");
    }

    public static void print(){
        System.out.println("Hello1");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b1 = new B();
//        B b2 = new A();

        b1.dontshow();


    }

}


