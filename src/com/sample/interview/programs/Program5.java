//Find the even number and sort them in ascending order
//Input 32 45 67 90 82
//Output 32 82 90

package com.sample.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program5 {

    public static void main(String[] args) {
        String[] strings = {"32", "45", "67", "90", "82","99"};
        List<String> arrayList = Arrays.asList(strings);
        arrayList(arrayList);
    }

    private static void arrayList(List<String> list) {
        int len = list.size();
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(list.get(i));
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < len; i++) {
            if (num[i] % 2 == 0) {
                arrayList.add(num[i]);
            }
        }
        System.out.println(arrayList);
    }
}
