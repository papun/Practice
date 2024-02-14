package src.revision;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        String str = "ABCDEFG";
        int mid = str.length() / 2;
        System.out.println(encode(str, mid, mid + 1));
    }

    public static String encode(String str, int left, int right) throws InterruptedException {
        char[] chars = str.toCharArray();

        while (left >= 0) {
            System.out.println(left);
            System.out.println(chars[left]);
            left--;
        }

        while (right < str.length()) {
            System.out.println(right);
            System.out.println(chars[right]);
            right++;
            TimeUnit.SECONDS.sleep(2);
        }
        return null;
    }
}
