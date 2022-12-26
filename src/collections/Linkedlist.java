package collections;

import java.util.LinkedList;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Ram"); //0 - 200(address)
        linkedlist.add("Sam"); //1 - 400
        linkedlist.add("Kan"); //2 - 500
        LinkedList<String> longs = new LinkedList<>();

        System.out.println(linkedlist);


        LinkedList<Integer> linkedlist1 = new LinkedList<>();
        linkedlist1.add(3); //0
        linkedlist1.add(5);
        linkedlist1.add(7);
        linkedlist1.add(9);//3


        System.out.println(linkedlist1.get(3));
        System.out.println(linkedlist1.contains(7));
        System.out.println(linkedlist1);
    }
}
