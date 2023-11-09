package src.pkg3;

public class ReverseStringWithSpaces {
    public static void main(String[] args) {
        String input = "abc de";
        String output = reverseStringWithSpaces(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String reverseStringWithSpaces(String input) {
        char[] inputArray = input.toCharArray();
        char[] outputArray = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                outputArray[i] = ' ';
            } else {
                int j = inputArray.length - 1 - i;
                while (inputArray[j] == ' ') {
                    j--;
                }
                outputArray[j] = inputArray[i];
            }
        }

        return new String(outputArray);
    }
}
