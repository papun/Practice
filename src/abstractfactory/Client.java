package src.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();
        System.out.println(e1.salary());
        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
        System.out.println(e2.salary());

    }
}
