package src.pkg1;

import java.util.*;

public class SecondHighest {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,1,5,6,4);

        System.out.println(l1);

        Optional<Integer> first = l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println(first.get());
    }
}
