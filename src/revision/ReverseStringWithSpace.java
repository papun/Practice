package src.revision;

public class ReverseStringWithSpace {

    public static void main(String[] args) {
        String input = "ab hhj cde";
        String output = reverseAllCharactersWithSpace(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);


    }

    private static String reverseAllCharactersWithSpace(String input) {
        char[] characters = input.toCharArray();
        int length = characters.length;

        // Reverse only non-space characters
        int start = 0;
        int end = length - 1;
        while (start < end) {
            if (characters[start] == ' ') {
                start++;
            } else if (characters[end] == ' ') {
                end--;
            } else {
                char temp = characters[start];
                characters[start] = characters[end];
                characters[end] = temp;
                start++;
                end--;
            }
        }

        return new String(characters);
    }
}
