package src.pkg1;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DuplicateChars {
    public static void main(String[] args) {
        String s = "India";
        char[] chars = s.toCharArray();
        Map<String, Long> collect = s.chars().mapToObj(String::valueOf).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(collect);


        final TreeMap<String,Integer> t1=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (final Character c:chars) {
            t1.merge(c.toString(),1,Integer::sum);
        }

        System.out.println(t1);

        final TreeMap<String, Integer> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        final String[] s1 = {"AAa","aaa","BBB","bbb","BbB","AaA","AAc"};

        for (final String s2 : s1) {
            treeMap.merge(s2, 1, Integer::sum);
        }

        System.out.println(treeMap);

    }
}
