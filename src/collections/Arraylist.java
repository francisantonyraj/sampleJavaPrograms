package collections;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ram");//0 - 10(address)
        arrayList.add("Sam");//1 - 11
        arrayList.add("Raj");//2 - 12
        arrayList.add("Victor");//3 - 13
        arrayList.add("Santhosh");//4
        arrayList.add("Daniel");//5

        arrayList.remove(3); //manipulation
        arrayList.add(3, "thomas"); //manipulation
        arrayList.clear();
        System.out.println("Clear :"+ arrayList);
//        System.out.println("List of names :" + arrayList.size());

//        for (String names : arrayList) {
//            System.out.println(names);
//        }
    }
}
