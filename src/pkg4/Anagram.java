package src.pkg4;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        System.out.println(checkAnagram(s1.toCharArray(), s2.toCharArray()));
    }

    private static boolean checkAnagram(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
