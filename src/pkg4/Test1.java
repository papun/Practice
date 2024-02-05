package src.pkg4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list1 = IntStream.rangeClosed(50, 200).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());

        HashSet<Integer> integers1 = new HashSet<>(list1);
        HashSet<Integer> integers2 = new HashSet<>(list2);

        integers1.retainAll(integers2);
        System.out.println(integers1);
        Object[] array1 = list1.toArray();
        Object[] array2 = list2.toArray();


//        int[] array1 = list1.stream().mapToInt(Integer::intValue).toArray();
//        int[] array2 = list2.stream().mapToInt(i -> i).toArray();
        Object[] collect = Stream.of(array1, array2).flatMap(Stream::of).toArray();
        Stream.concat(Arrays.stream(array1),
                        Arrays.stream(array2))
                .toArray();

        System.out.println(Arrays.toString(collect));


        Integer[] a = {1, 2, 3, 4};
        Integer[] b = {5, 6};

        Object[] array = Stream.of(a, b).flatMap(Stream::of).toArray();

        System.out.println(Arrays.toString(array));
    }
}
