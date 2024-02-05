package src.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("p1", 22),
                new Person("a3", 23),
                new Person("a3", 10));
        System.out.println(personList);

        Comparator<Person> personComparator = Comparator.comparing(Person::getAge).thenComparing(Person::getName);
        personList.sort(personComparator);

        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println(personList);
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
}
