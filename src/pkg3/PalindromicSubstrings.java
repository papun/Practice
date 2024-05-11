package src.pkg3;


import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String input = "ACABABACAC";
        List<String> palindromicSubstrings = getAllPalindromicSubstrings(input);

        System.out.println("Palindromic Substrings:");
        for (String palindrome : palindromicSubstrings) {
            System.out.println(palindrome);
        }

        System.out.println("Count of Palindromic Substrings: " + palindromicSubstrings.size());
    }

    public static List<String> getAllPalindromicSubstrings(String s) {
        List<String> palindromicSubstrings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes
            expandAroundCenter(s, i, i, palindromicSubstrings);

//            // Even length palindromes
//            expandAroundCenter(s, i, i + 1, palindromicSubstrings);
        }

        return palindromicSubstrings;
    }

    private static void expandAroundCenter(String str, int left, int right, List<String> palindromicSubstrings) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            if (str.substring(left, right + 1).length() > 1)
                palindromicSubstrings.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }
}
