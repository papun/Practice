package src.pkg3;

public class ArrayIncrementer {
    public static int[] incrementArray(int[] array) {
        if (array == null) {
            return null; // Handle null input
        }

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 9};
        int[] incrementedDigits = incrementArray(digits);

        // Print the original and incremented arrays
        System.out.print("Original Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.print("Incremented Array: ");
        for (int digit : incrementedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
