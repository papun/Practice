package src.revision;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class DupChars {
    public static void main(String[] args) {
        String s = "India";
        char[] chars = s.toLowerCase().toCharArray();
        Map<Character, Long> collect = s.chars().mapToObj(str -> ((char) str)).collect(Collectors.groupingBy(c -> c, counting()));


        Map<String, Long> collect1 = Stream.of(chars).map(ss -> ss.toString()).collect(Collectors.groupingBy(Function.identity(), counting()));

        System.out.println(collect);
    }
}
