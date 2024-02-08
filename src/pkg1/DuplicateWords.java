package src.pkg1;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static void main(String[] args) {
        String[] s = {"this","is", "is", "the", "list", "of", "price", "list", "types"};
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (Objects.equals(s[i], s[j])) {
                 System.out.println(s[j]);
                }
            }

        }
        String str = "This is is the the";
        String[] s3 = str.split(" ");


        Map<String, Long> collect = Arrays.stream(s).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);

        collect.forEach((s1,s2) -> {
           if( s2>1)
               System.out.println(s1);
        });
    }
}
