package src.pkg1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 1, 2, 3, 4, 5, 6);
        HashSet<Integer> duplicates = new HashSet<Integer>();
        System.out.println(duplicates);
        List<Integer> collect = integers.stream().filter(i -> !duplicates.add(i)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
