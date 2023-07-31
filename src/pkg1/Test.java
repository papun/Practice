package pkg1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {
        final TreeMap<String, Integer> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        final String[] s1 = {"AAa","AAa","aaa","BBB","bbb","BbB","AaA","AAc"};

        for (final String s : s1) {
            treeMap.merge(s, 1,Integer::sum);
        }

        System.out.println(treeMap);


        //Another

        String[] s2 =s1;
        HashMap<String,Integer> hm = new HashMap();
        for (int i = 0; i < s2.length; i++) {
            if (s2[i]!="")
                hm.put(s2[i], hm.getOrDefault(s2[i],0)+1);
            for (int j = i+1; j <s2.length ; j++) {
                if (s2[i].equalsIgnoreCase(s2[j]) && s2[j]!=""){
                    hm.put(s2[i], hm.getOrDefault(s2[i],0)+1);
                    s2[j]="";
                }
            }
        }

        System.out.println(hm);
        System.out.println(Arrays.toString(s2));

        int i = 0b01010101010101010101010101010101;
        System.out.println(i);

    }
}
