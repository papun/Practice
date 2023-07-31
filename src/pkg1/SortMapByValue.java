package pkg1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortMapByValue {
    public static void main(String[] args) {

        List<Student> students = getStudentList();
        System.out.println(students);
        List<Student> students1 = students.stream().sorted(Comparator.comparingInt(Student::getMarks)).collect(Collectors.toList());
        System.out.println(students1.get(0));

        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120);
        budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellaneous", 90);

        System.out.println("map before sorting: " + budget);

        LinkedHashMap<String, Integer> collect = budget.entrySet().stream().sorted(comparingByValue()).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println(collect);


    }

    public static List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Pap",24));
        students.add(new Student(2,"Qap",21));
        students.add(new Student(3,"Sap",20));
        students.add(new Student(4,"Zap",29));
         return students;
    }
}
