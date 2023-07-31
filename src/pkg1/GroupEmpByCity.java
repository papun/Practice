package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmpByCity {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList= List.of(new Employee("John1", "Kolkata1"),
                new Employee("John2", "Kolkata2"),
                new Employee("John3", "Kolkata2"),
                new Employee("John4", "Kolkata1"),
                new Employee("John5", "Kolkata1"));

        System.out.println(empList);

        Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(collect);

        empList.stream().collect(Collectors.groupingBy(Employee::getCity)).entrySet().forEach(e ->{
            System.out.print(e.getKey()+" :");
            System.out.println(e.getValue().stream().map(Employee::getName).collect(Collectors.joining(",")));
        });

    }

   static class Employee {
        String name;
        String city;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getCity() {
           return city;
       }

       public void setCity(String city) {
           this.city = city;
       }

       @Override
       public String toString() {
           return "Employee{" +
                   "name='" + name + '\'' +
                   ", city='" + city + '\'' +
                   '}';
       }

       public Employee(String name, String city) {
            this.name = name;
            this.city = city;
        }
    }
}
