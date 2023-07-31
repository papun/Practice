package pkg2;

import pkg1.Employee;
import pkg1.Java8Demo;

import java.util.Comparator;
import java.util.List;

public class EmployeeComparator {
    public static void main(String[] args) {
        List<Employee> eList = Java8Demo.initEmps();
        eList.stream().sorted(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getEmpSal)).forEach(System.out::println);
    }



}
