package src.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8FrequentPrograms {
    public static void main(String[] args) {

        //Find Occurrence of all characters
        String str = "ilovajavatechie";

        String[] strArr = str.split("");

        Map<String, Long> occurrence = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrence);


        //Find all Duplicate Elements
        Arrays.stream(strArr).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .filter(key -> key.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //Extract Keys From Map Without using Stream using For Each
        Map<String, Long> charMap = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charMap.entrySet().forEach(s -> {
            System.out.println("Key is :" + s.getKey());
            System.out.println("Value is :" + s.getValue());
        });
        //Extract Keys From Map using Stream
        List<String> collect = charMap.entrySet().stream().map(s -> s.getKey()).collect(Collectors.toList());
        System.out.println(collect);

        //Extract Values Using Stream
        List<Long> collect1 = charMap.entrySet().stream().map(s -> s.getValue()).collect(Collectors.toList());
        System.out.println(collect1);


        //First Non-repeating char
        Map<String, Long> charMap1 = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charMap1);

        String collect2 = charMap1.entrySet().stream()
                .filter(s -> s.getValue() == 1)
                .map(s1 -> s1.getKey())
                .findFirst().get();
        System.out.println(collect2);

        //Second-Highest Number
        int[] a = {5, 9, 11, 2, 8, 21, 1};
        Integer i = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);

        //Longest string
        String[] s = {"aws", "docker", "Micro", "Microservices", "dog", "kubernetes"};

        String s3 = Arrays.stream(s).reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2).get();
        System.out.println(s3);


        //Find numbers starting with 1
        int[] a1 = {5, 9, 11, 2, 8, 21, 1, 29, 235};
        List<String> collect3 = Arrays.stream(a1).boxed().map(s1 -> s1 + "")
                .filter(s2 -> s2.startsWith("2"))
                .collect(Collectors.toList());

        System.out.println(collect3);


        //String.Join

        List list = Arrays.asList("1", "2", "3", "4");

        String join = String.join("-", list);
        System.out.println(join);

    }
}
