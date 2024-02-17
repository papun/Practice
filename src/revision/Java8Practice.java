package src.revision;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Practice {
    public static void main(String[] args) {
        List<Employee1> eList = new ArrayList<>();
        initEmps(eList);
        System.err.println(eList.size());
        eList.forEach(System.out::println);
        //Male Female Count
        System.out.println("=========");
        System.out.println("Male Female Count");
        Map<String, Long> collect = eList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
        System.out.println(collect);

        System.out.println("==========");
        System.out.println("Name of Each Department");
        List<String> collect1 = eList.stream().map(e -> e.department).distinct().collect(Collectors.toList());
        System.out.println(collect1);

        System.out.println("=========");
        System.out.println("Average age of Male and Female Employees");
        Map<String, Double> collect2 = eList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
        System.out.println(collect2);

        System.out.println("=========");
        System.out.println("Employees who joined after 2015");
        List<String> collect3 = eList.stream().filter(e -> e.yearOfJoining > 2015).map(e1 -> e1.name).distinct().collect(Collectors.toList());
        System.out.println(collect3);

        System.out.println("=========");
        System.out.println("No of Employees in each department");
        Map<String, Long> collect4 = eList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
        System.out.println(collect4);

        System.out.println("=========");
        System.out.println("Average Salary of each department");
        Map<String, Double> collect5 = eList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.averagingDouble(Employee1::getSalary)));
        System.out.println(collect5);

        System.out.println("=========");
        System.out.println("Oldest Employee Details");
        Employee1 employee1 = eList.stream().max(Comparator.comparingInt(Employee1::getAge)).get();
        System.out.println(employee1);

        System.out.println("=========");
        System.out.println("Average & total Salary of Org");
        DoubleSummaryStatistics collect6 = eList.stream().collect(Collectors.summarizingDouble(Employee1::getSalary));
        System.out.println(collect6);
        Double collect7 = eList.stream().mapToDouble(Employee1::getSalary).sum();
        System.out.println(collect7);
        Optional<Double> reduce = eList.stream().map(Employee1::getSalary).reduce(Double::sum);
        System.out.println(reduce.get());

        System.out.println("=========");
        System.out.println("Longest Name");
        String s = eList.stream().map(Employee1::getName).reduce((val1, val2) -> val1.length() > val2.length() ? val1 : val2).get();
        System.out.println(s);
        System.out.println("=========");
        System.out.println("Dept wise Highest Salary");
        Map<String, Employee1> stringEmployeeMap = eList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)), Optional::get)));

        System.out.println(stringEmployeeMap);


        Map<String, Optional<Employee1>> collect8 = eList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee1::getSalary)))));

        Map<String, Optional<Employee1>> collect9 = eList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.reducing((e1, e2) -> e1.salary > e2.salary ? e1 : e2)));
        collect9.forEach((key, value) -> {
            System.out.print("Dept :" + key);
            System.out.println("Name :" + value.get().name);
        });


        System.out.println("=========");
        System.out.println("Extract digits");

        String str = "ab12pq34";
        char[] chars = str.toCharArray();
        int tt = 0;
        for (Character c : chars) {
            if (Character.isDigit(c))
                tt += Character.getNumericValue(c);
        }
        System.out.println(tt);


        System.out.println("===========");
        System.out.println("First Repeated Char");

        String str1 = "Extract digits";
        LinkedHashMap<Character, Long> collect10 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect10);

        Character c = collect10.entrySet().stream().filter(e -> e.getValue() > 1).findFirst().map(e1 -> e1.getKey()).stream().findFirst().get();
        System.out.println(c);

    }

    private static void initEmps(List<Employee1> empList) {


        empList.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        empList.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        empList.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        empList.add(new Employee1(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        empList.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        empList.add(new Employee1(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        empList.add(new Employee1(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        empList.add(new Employee1(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        empList.add(new Employee1(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        empList.add(new Employee1(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        empList.add(new Employee1(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        empList.add(new Employee1(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        empList.add(new Employee1(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        empList.add(new Employee1(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        empList.add(new Employee1(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        empList.add(new Employee1(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        empList.add(new Employee1(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.err.println(empList.size());
    }
}


@Getter
@AllArgsConstructor
@Data
class Employee1 {

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

}

