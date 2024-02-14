package src.pkg1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Student1> lt = new ArrayList<>();

        // add the member of list
        lt.add(new Student1(1, "Geeks"));
        lt.add(new Student1(2, "For"));
        lt.add(new Student1(3, "Geeks"));

        // create map with the help of
        // Collectors.toMap() method
        LinkedHashMap<Integer, String> collect = lt.stream()
                .collect(Collectors.toMap(Student1::getId, Student1::getName, (x, y) -> x + y, LinkedHashMap::new));

        // print map
        collect.forEach(
                (x, y) -> System.out.println(x + "=" + y));
    }
}

class Student1 {

    // id will act as Key
    private final Integer id;

    // name will act as value
    private final String name;

    // create curstuctor for reference
    public Student1(Integer id, String name) {

        // assign the value of id and name
        this.id = id;
        this.name = name;
    }

    // return private variable id
    public Integer getId() {
        return id;
    }

    // return private variable name
    public String getName() {
        return name;
    }
}

