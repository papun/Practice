package src.pkg1;

public class MultitonTest {

    public static void main(String[] args) {
        Multiton instance1 = Multiton.getInstance();
        Multiton instance2 = Multiton.getInstance();
        Multiton instance3 = Multiton.getInstance();
        Multiton instance4 = Multiton.getInstance();
        Multiton instance5 = Multiton.getInstance();
        Multiton instance6 = Multiton.getInstance();
        Multiton instance7 = Multiton.getInstance();
        Multiton instance8 = Multiton.getInstance();

        System.out.println("Instance1 :"+instance1.hashCode());
        System.out.println("Instance2 :"+instance2.hashCode());
        System.out.println("Instance3 :"+instance3.hashCode());
        System.out.println("Instance4 :"+instance4.hashCode());
        System.out.println("Instance5 :"+instance5.hashCode());
        System.out.println("Instance6 :"+instance6.hashCode());
        System.out.println("Instance7 :"+instance7.hashCode());
        System.out.println("Instance8 :"+instance8.hashCode());
    }
}
