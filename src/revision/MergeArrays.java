package src.revision;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        String[] names1 = {"Balazs", "Vikrant", "Mohasin", "Ahmed"};
        String[] names2 = {"Vihar", "Balazs", "Roshan", "Vikrant"};

        Object[] array = Stream.of(names1, names2).flatMap(Stream::of).distinct().toArray();
        System.out.println(Arrays.toString(array));

        Object[] array1 = Stream.concat(Stream.of(names1), Stream.of(names2)).toArray();
        System.out.println(Arrays.toString(array1));
    }
}
