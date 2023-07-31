package pkg1;

public class ReplaceChars {
    public static void main(String[] args) {
        String s = "8123921823";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-2; i++) {
            chars[i]='*';

        }
        System.out.println(String.valueOf(chars));


        Integer random = (int) (Math.random()*10000);
        System.out.println(random);
    }
}
