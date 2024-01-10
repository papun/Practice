package src.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {
        String str = "ilovajavatechie";

        String[] strArr = str.split("");

        Map<String, Long> occurrence = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrence);
    }
}
