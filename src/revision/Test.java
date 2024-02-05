package src.revision;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] str = {"blr", "pune", "Hyd", "blr", "hyd"};
        System.out.println(Arrays.toString(str));

        Map<String, Long> collect = Stream.of(str).collect(Collectors.groupingBy(s -> s.toLowerCase(), Collectors.counting()));
        System.out.println(collect);
    }
}
