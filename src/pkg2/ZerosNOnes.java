package src.pkg2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ZerosNOnes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(nums));

        String collect = Arrays.stream(nums).filter(i -> i == 0).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect);
        String collect2 = Arrays.stream(nums).filter(i -> i == 1).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect2);


        long collect1 = Arrays.stream(nums).filter(i -> i == 0).mapToObj(String::valueOf).count();
        System.out.println(collect1);
    }
}
