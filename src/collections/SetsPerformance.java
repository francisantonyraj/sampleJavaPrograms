package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsPerformance {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        long startTimeHashSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashSet.add(i);
        }
//        for (int i = 0; i < 1000; i++) {
//            hashSet.remove(i);
//        }

        long endTimeHashSet = System.nanoTime();
        long totalTimeHashSet = endTimeHashSet - startTimeHashSet;
        System.out.println("Total time by HashSet :" + totalTimeHashSet);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        long startTimeLinkedHashSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedHashSet.add(i);
        }
//        for (int i = 0; i < 1000; i++) {
//            linkedHashSet.remove(i);
//        }
        long endTimeLinkedHashSet = System.nanoTime();
        long totalTimeLinkedHashSet = endTimeLinkedHashSet - startTimeLinkedHashSet;
        System.out.println("Total time by LinkedHashSet :" + totalTimeLinkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        long startTimeTreeSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeSet.add(i);
        }
//        for (int i = 0; i < 1000; i++) {
//            treeSet.remove(i);
//        }
        long endTimeTreeSet = System.nanoTime();
        long totalTimeTreeSet = endTimeTreeSet - startTimeTreeSet;
        System.out.println("Total time by TreeSet :" + totalTimeTreeSet);
    }
}
