package src.revision;

import java.util.Arrays;

public class IndexIncrement {
    public static void main(String[] args) {
        int[] arr = {1, 9, 9, 9};

        int[] outputArr = incrementIndex(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(outputArr));
    }

    private static int[] incrementIndex(int[] arr) {
        int size = arr.length;
        if (size == 0)
            return new int[]{-1};

        int[] outputArray = new int[size];
        int carry = 1;
        for (int i = size - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            outputArray[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newOpArr = new int[size + 1];
            newOpArr[0] = carry;
            System.arraycopy(outputArray, 0, newOpArr, 1, size);
            return newOpArr;
        } else {
            return outputArray;
        }
    }
}
