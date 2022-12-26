//Find common elements in three sorted arrays
//ar1[]={1,5,10,20,40,80}
//ar2[]={6,7,20,80,100}
//ar3[]={3,4,15,20,30,70,80,120}
//Output: 20, 80

package com.sample.interview.programs;

import java.util.TreeSet;

public class Program3 {

    public static void main(String[] args) {
        Integer ar1[] = {1, 5, 10, 20, 40, 80};
        Integer ar2[] = {6, 7, 20, 80, 100};
        Integer ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]) {
                    treeSet.add(ar1[i]);
                }
            }
        }
        for (int i = 0; i < ar3.length; i++) {
            for (int j = 0; j < treeSet.size(); j++) {
                if (!treeSet.contains(ar3[i])) {
                    treeSet.remove(ar3[i]);
                }
            }
        }
        System.out.println(treeSet);
    }
}