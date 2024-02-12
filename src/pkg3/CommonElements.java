package src.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 6));

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.removeAll(list2);
        System.out.println(list);
        list2.retainAll(list1);
        System.out.println(list2);
        String str = "abcd";
        StringBuilder sb = new StringBuilder(str);
        sb.insert(3, " ");
        System.out.println(sb);

        String str1 = "abc de  ffghh jkk";
        System.out.println(str1);
        ArrayList<Integer> positions = new ArrayList<>();
        String nstr = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ')
                positions.add(i);
            else
                nstr = str1.charAt(i) + nstr;
        }
        StringBuilder sb1 = new StringBuilder(nstr);
        for (int i = 0; i < positions.size(); i++) {
            sb1.insert(positions.get(i), " ");
        }
        str1 = str1.replaceAll(" ", "");
        System.out.println(sb1);
    }
}
