package src.test;

import java.util.Arrays;
import java.util.function.Consumer;

public class ToString {
    public static void main(String[] args) {
        int[] ints = {9, 9, 9, 9, 9, 9, 9, 9};
        String s = Arrays.toString(ints);
        System.out.println(Arrays.toString(ints));
//        arrayIncrement(ints);

        Consumer c = ToString::arrayIncrement;
        c.accept(s);
    }

    private static void arrayIncrement(Object s1) {
        String s = s1.toString();
        s = s.replaceAll("\\D", "");
        int val = Integer.parseInt(s) + 1;
        char[] digits = String.valueOf(val).toCharArray();
        System.out.println(Arrays.toString(digits));
    }
}
