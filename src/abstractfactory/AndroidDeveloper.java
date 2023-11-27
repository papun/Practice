package src.abstractfactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 1000;
    }

    @Override
    public String name() {
        System.out.println("Android Developer");
        return "Android Developer";
    }
}
