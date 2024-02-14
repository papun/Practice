package src.pkg3;

import java.util.function.Consumer;
import java.util.function.Function;

public class ChangeIndexValue1 {
    public static void main(String[] args) {
        int[] input = {1, 2, 9};
        int[] output = incrementByOne(input);

//        printArray(input);
//        printArray(output);

        Consumer<int[]> consumer = (int[] arr) -> ChangeIndexValue1.printArray(arr);
        Function<int[], int[]> function = (int[] arr) -> ChangeIndexValue1.incrementByOne(arr);
        int[] apply = function.apply(input);
        consumer.accept(apply);
        System.out.println("--------");
        consumer.accept(input);
        System.out.println("--------");
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
