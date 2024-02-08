package src.revision;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "ACABABACA";

        List<String> list = findAllPalindromicSubstrings(str);
        list.forEach(System.out::println);
        System.out.println(list.size());
    }

    private static List<String> findAllPalindromicSubstrings(String str) {
        List<String> subStrings = new ArrayList<>();
        for (int i = 0; i <= str.length(); i++) {
            expandAroundCenter(str, i, i, subStrings);
        }
        return subStrings;
    }

    public static void expandAroundCenter(String str, int left, int right, List<String> subStrings) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            if (str.substring(left, right + 1).length() > 1)
                subStrings.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }
}
