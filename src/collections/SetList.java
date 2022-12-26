package collections;

import java.util.*;

public class SetList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = new LinkedList<>();
        list = new Vector<>();
        list = new Stack<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(null);
        list.add(null);

        System.out.println("List :" + list);

        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(3);
//        set.add(null);
//        set.add(null);
        System.out.println("Set :" + set);
    }
}
