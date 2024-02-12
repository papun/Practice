package src.pkg4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LongestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        List list = Arrays.asList(3, 30, 34, 5, 9);
        Collections.sort(list, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));

        Object collect1 = list.stream().map(String::valueOf).collect(Collectors.joining(""));
        System.out.println("=========");
        System.out.println(collect1);


        String[] num = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        Arrays.sort(num, ((a, b) -> (b + a).compareTo(a + b)));

        String collect = Arrays.stream(num).collect(Collectors.joining(""));
        System.out.println(collect);


    }
}
