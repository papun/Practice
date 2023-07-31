package pkg1;

public class StringReverse {
    public static void main(String[] args) {
        String str ="this is is the list of price list types";

        String[] s = str.split(" ");
        StringBuilder sb1=new StringBuilder();
        for (String str1:s) {
            StringBuilder sb = new StringBuilder(str1);
            sb1.append(sb.reverse()).append(" ");
        }
        System.out.println(sb1);
    }
}
