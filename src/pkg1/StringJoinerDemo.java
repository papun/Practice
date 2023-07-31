package pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {

    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(",","[","]");
        sj1.add("A").add("b").add("c");
        StringJoiner sj2 = new StringJoiner(":");
        sj2.add("p").add("q");
        sj1.merge(sj2);
        System.out.println(sj1);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        System.out.println(numbers);
        String commaSeparatedNumbers = numbers.stream().
                map(i -> i.toString()).collect(Collectors.joining());

        System.out.println(commaSeparatedNumbers);
    }
}
