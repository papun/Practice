package src.pkg1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayIntersect {

    public static void main(String[] args) {
        int [] arr1 = {80,10,15,2,35,60};
        int [] arr2 = {35,80,60,20,75};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        List<Integer> ints1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        for (int i:arr2)
            if (ints1.contains(i))
                System.out.println(i);


        Set<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        for (int i:arr2) collect.add(i);

        System.out.println(collect);
    }
}
