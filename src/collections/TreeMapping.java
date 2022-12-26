package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapping {

    public static void main(String[] args) {
        Map<String, Integer> mapping = new TreeMap<>();
        mapping.put("Ram", 104);
        mapping.put("Sam", 102);
        mapping.put("Arun", 103);
        mapping.put("Dinesh", 101);

        System.out.println(mapping);
    }
}
