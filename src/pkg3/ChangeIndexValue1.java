package src.pkg3;

public class ChangeIndexValue1 {
    public static void main(String[] args) {
        int[] input = {9, 9, 9};
        int[] output = incrementByOne(input);

        printArray(input);
        printArray(output);
    }

    private static void printArray(int[] input) {
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] incrementByOne(int[] input) {
        int n = input.length;
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
}
