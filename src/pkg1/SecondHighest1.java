package src.pkg1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest1 {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,9,1, 5, 7, 8, 9, 12, 13, 14, 15);
//        integers.forEach(System.out::println);

        Integer integer = integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);
    }
}
