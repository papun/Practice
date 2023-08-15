package src.leetcode;

public class PallindromeSoln {
    public static void main(String[] args) {
        System.out.println(new PallindromeSoln().isPalindrome(123));
    }

    public boolean isPalindrome(int x) {
        String x1 = String.valueOf(x);
        int n = x1.length();
        System.out.println(x1);
        for (int i = 0; i < n / 2; i++) {
            if (x1.charAt(i) != x1.charAt(n - i - 1))
                return false;
        }
        return true;
    }
}
