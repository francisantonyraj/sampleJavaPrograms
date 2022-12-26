package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashSet<String> hashSet = new HashSet<>();

        String[] arr = {"Element1", "Element2", "Element3", "Element1", };

        for (String str : arr) {
            linkedHashSet.add(str);
            linkedHashSet.add(null);
            linkedHashSet.add(null);
            treeSet.add(str);
//            treeSet.add(null);
//            treeSet.add(null);
            hashSet.add(str);
            hashSet.add(null);
            hashSet.add(null);
        }


        System.out.println("Insertion order of linkedHashSet" + linkedHashSet);
        System.out.println("Insertion order of treeSet" + treeSet);
        System.out.println("Insertion order of hashSet" + hashSet);
    }
}
