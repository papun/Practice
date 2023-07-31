package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        System.out.println(map);

        List<Integer> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);
        List<String> values = map.values().stream().collect(Collectors.toList());
        System.out.println(values);


    }
}
