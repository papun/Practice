package src.pkg3;

public class ChangeIndexValue {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 9};
        int[] output1 = changeIndexValue(input1);
        printArray(output1);

        int[] input2 = {};
        int[] output2 = changeIndexValue(input2);
        printArray(output2);

        int[] input3 = {1, 3, 4, 9};
        int[] output3 = changeIndexValue(input3);
        printArray(output3);
    }

    public static int[] changeIndexValue(int[] input) {
        int n = input.length;
        if (n == 0) {
            return new int[]{1};
        }

        int[] output = new int[n];
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            int sum = input[i] + carry;
            output[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newOutput = new int[n + 1];
            newOutput[0] = carry;
            System.arraycopy(output, 0, newOutput, 1, n);
            return newOutput;
        } else {
            return output;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
