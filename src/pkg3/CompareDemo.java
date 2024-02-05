package src.pkg3;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class CompareDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 25));
        persons.add(new Person("Charlie", 35));
        persons.add(new Person("David", 22));
        Comparator<Person> ageComp = Comparator.comparingInt(Person::getAge).thenComparing(Person::getName);
        System.out.println(persons);
        persons.sort(ageComp);
        System.out.println(persons);


        List<Integer> a = Arrays.asList(1, 2, 3, 1, 2, 1, 3);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
    }
}

@Setter
@Getter
class Person {
    private String name;
    private Integer age;
//    private Double sal;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
//        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
