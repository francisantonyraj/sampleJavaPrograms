//Write a program take the input as String and covert to an Integer.
//Then perform the below result
//Input  : 32, 8, 3, 7
//Output :
// 4 weeks + 4 days
// 1 week  + 1 day
// 3 days
// 1 week

package com.sample.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program11 {
    private static void displayOutput(String[] num) {
        List<String> list = Arrays.asList(num);
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(Integer.parseInt(list.get(i)));
        }

        for (int i = 0; i < list1.size(); i++) {
            int numberOfWeeks = list1.get(i) / 7;
            int numberOfDays = list1.get(i) % 7;
            if (numberOfWeeks > 1 && numberOfDays > 1) {
                System.out.println(numberOfWeeks + " Weeks" + " + " + numberOfDays + " days");
            } else if (numberOfWeeks == 1 && numberOfDays == 1) {
                System.out.println(numberOfWeeks + " Week" + " + " + numberOfDays + " day");
            } else if (numberOfWeeks == 0 && numberOfDays > 1) {
                System.out.println(numberOfDays + " days");
            } else if (numberOfWeeks < 2 && numberOfDays == 0) {
                System.out.println(numberOfWeeks + " week");
            }
        }
    }

    public static void main(String[] args) {
        String[] nums = {"32", "8", "3", "7"};
        displayOutput(nums);
    }
}
