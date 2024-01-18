package src.pkg3;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
        String[] names1 = {"Balazs", "Vikrant", "Mohasin", "Ahmed"};
        String[] names2 = {"Vihar", "Balazs", "Roshan", "Vikrant"};

        System.out.println(Arrays.toString(names1));
        System.out.println(Arrays.toString(names2));

        Object[] names11 = Stream.of(names1, names2).flatMap(Stream::of).distinct().toArray();
        System.out.println(Arrays.toString(names11));


    }
}

