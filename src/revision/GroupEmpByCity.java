package src.revision;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupEmpByCity {
    public static void main(String[] args) {
        List<Emp> emps = List.of(new Emp("P1", "b1"),
                new Emp("P2", "b2"),
                new Emp("P3", "b1"),
                new Emp("P4", "b2"),
                new Emp("P5", "b1"));

        System.out.println(emps);

        emps.stream().collect(Collectors.groupingBy(Emp::getCity, LinkedHashMap::new, Collectors.toList())).entrySet()
                .stream().filter(e1 -> e1.getKey() != "b2")
                .forEach(e -> {
                    System.out.print("City :" + e.getKey());
                    System.out.println("  Emps :" + e.getValue().stream().map(Emp::getName).collect(Collectors.joining(",")));
                });

    }
}


class Emp {
    private final String name;
    private final String city;

    public Emp(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
