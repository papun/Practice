package src.methodRefDemo;


interface Test {
    void getName(String name);
}

public class TestMethodRef {
    public static void getInfo(String info) {
        System.out.println(info);
    }

    public static void main(String[] args) {
        Test t = TestMethodRef::getInfo;
        t.getName("kjllkl");
    }
}
