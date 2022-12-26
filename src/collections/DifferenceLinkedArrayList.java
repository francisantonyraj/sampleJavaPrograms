package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class DifferenceLinkedArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        final long startTimeList = System.nanoTime();
        arrayList.remove(500);
        final long endTimeList = System.nanoTime();

        final long startTimeLinkedList = System.nanoTime();
        linkedList.remove(500);
        final long endTimeLinkedList = System.nanoTime();

        final long totalListTime = endTimeList - startTimeList;
        final long totalLinkedListTime = endTimeLinkedList - startTimeLinkedList;
        System.out.println("ArrayList Time taken :" + totalListTime);
        System.out.println("LinkedList Time taken :" + totalLinkedListTime);
    }
}
