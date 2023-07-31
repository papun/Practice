package src.pkg1;

public class PalindromesInaString {
    public static void main(String[] args) {
        String str = "My name is bob and i can speak malayalam";
        String[] s = str.split(" ");

        for (String s2:s) {
            StringBuffer sb2 = new StringBuffer();
            sb2.append(s2);
            if(s2.contentEquals(sb2.reverse()))
                System.out.println(sb2);
        }

    }
}
