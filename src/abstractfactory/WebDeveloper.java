package src.abstractfactory;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 2000;
    }

    @Override
    public String name() {
        System.out.println("Web Developer");
        return "Web Developer";
    }
}
