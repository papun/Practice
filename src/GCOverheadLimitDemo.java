package src;


import java.util.ArrayList;
import java.util.List;

public class GCOverheadLimitDemo {
    public static void main(String[] args) {
        int count = 0;
        List<Employee> list = new ArrayList<>();
        while (true) {
            System.out.println(++count);
            list.add(new Employee(count, "Ranga " + count, count, count * 0.5f));
        }
    }
}
