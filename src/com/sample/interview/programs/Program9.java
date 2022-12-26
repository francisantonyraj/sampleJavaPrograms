//Given an array of Integers find the highest and lowest number and show their addition.
//Eg. Input[1,2,3,4,5]
//Output: Highest number - 5
//        Lowest number  - 1
//        Addition number - 6
package com.sample.interview.programs;

import java.util.*;
import java.util.stream.Collectors;

public class Program9 {

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 1, 5};
        Arrays.sort(num);
        List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());

        int addFirstNumber = list.get(0);
        int lastNumber = list.get(list.size() - 1);
        System.out.println("Addition of first and second number " + (addFirstNumber + lastNumber));
    }
}
