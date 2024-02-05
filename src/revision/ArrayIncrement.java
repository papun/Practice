package src.revision;

import java.util.Arrays;

public class ArrayIncrement {
    public static void main(String[] args) {
        int[] arr = {1, 9, 9};

        int[] output = incrementValue(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(output));
    }

    private static int[] incrementValue(int[] arr) {
        int n = arr.length;
        int carry = 1;

        if (n == 0) return new int[]{1};
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            output[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newoutput = new int[n + 1];
            newoutput[0] = carry;
            System.arraycopy(output, 0, newoutput, 1, n);
            return newoutput;
        } else {
            return output;
        }
    }
}
