package pkg1;

public class Splir {
    public static void main(String[] args) {
        String str = "Hello how are you";
        StringBuilder s2;
        String[] s = str.split(" ");
        for (String s1:s) {
            s2 = new StringBuilder(s1);
            System.out.println(s2.reverse());
        }
    }
}
