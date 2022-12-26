package collections;

import java.util.ArrayList;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        String [] str = {"Class1","Class2"};
        ArrayList<String> stringArraylist = new ArrayList<>();
        stringArraylist.add("Class1");
        stringArraylist.add("Class2");
        Vector<String> vector = new Vector<>(); //Default it will set 10
        vector.add("Element1");//0
        vector.add("Element2");//1
        vector.add("Element3");//2
        vector.add("Element4");//3
        vector.add("Element5");
        vector.add("Element6");
        vector.add("Element7");
        vector.add("Element8");
        vector.add("Element9");
        vector.add("Element10");
        vector.add("Element11");
        vector.add("Element12");
        vector.add("Element13");
        vector.add("Element14");

        System.out.println(vector);
        boolean value = vector.contains("Element");
        vector.addAll(stringArraylist); //adding
        vector.capacity();
        vector.remove(3);
        System.out.println(vector);
        int len = vector.size();
        System.out.println(len);
    }

}
