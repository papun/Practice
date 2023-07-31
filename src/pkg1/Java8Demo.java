package pkg1;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        List<Employee> eList = initEmps();
        System.out.println(eList);

        Map<String, Double> avgSal = eList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingInt(e1 -> e1.getEmpSal())));
        System.out.println(avgSal);

        Optional<Employee> first = eList.stream().sorted(Comparator.comparingInt(Employee::getEmpSal).reversed()).skip(1).findFirst();
        System.out.println(first.get());
        List<Integer> collect5 = eList.stream().filter(e -> e.getEmpSal() > 0 && e.getGender() == "M").sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList()).stream().map(e -> e.getEmpId()).collect(Collectors.toList());
        System.out.println("Collect5:"+collect5);
        eList.stream().sorted(Comparator.comparing(Employee::getEmpId).thenComparing(Employee::getEmpSal)).forEach(System.out::println);

        String str = "I am a good boy";
        str=str.replaceAll(" ","");
        System.out.println(str);
        Map<Character, Long> collect = str.chars().mapToObj(c1 -> (char)c1).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

        List<Integer> integers = List.of(1, 2, 4, 7, 8, 9, 10);
        List<Integer> collect1 = integers.stream().filter(n -> n %2 == 0).collect(Collectors.toList());
        System.out.println(collect1);

        List<?> collect2 = integers.stream().map(s->s+"").filter(n -> n.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect2);

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> newSet = new HashSet<>();
        List<Integer> collect3 = myList.stream().filter(n -> !newSet.add(n)).collect(Collectors.toList());
        System.out.println(collect3);


        Integer integer = myList.stream().findFirst().get();
        System.out.println(integer);

        Integer integer1 = myList.stream().max(Integer::compareTo).get();
        System.out.println(integer1);


        List<Employee> collect4 = eList.stream().filter(e -> e.getEmpSal() > 6500).collect(Collectors.toList());
        System.out.println("Employees Greater than 6500 salary:"+collect4);
    }

    public static List<Employee> initEmps(){
        List<Employee> e1= List.of(
                new Employee(1,"Pap","M",5000),
                new Employee(3,"Jhu","F",6000),
                new Employee(2,"Pap1","M",7000),
                new Employee(4,"Jhu1","F",8000)
        );

        return e1;
    }
}
