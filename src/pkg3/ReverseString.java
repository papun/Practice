package src.pkg3;

public class ReverseString {
    public static void main(String[] args) {
        String input = "I am a Java Developer";
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        String output = reversedString.toString();
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}