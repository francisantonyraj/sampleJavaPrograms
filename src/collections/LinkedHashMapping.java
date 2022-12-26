package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapping {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> mapping = new LinkedHashMap<>();
        map.put("Ram",100);
        map.put("Sam",101);
        map.put("Vincent",102);
        map.put(null,102);
        map.put(null,null);

        map.replace("Vincent",103);

        System.out.println(map);
        System.out.println(map.get("Vincent"));

    }
}
