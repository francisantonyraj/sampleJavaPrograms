//Write a program to find the highest and lowest frequency of the characters of string and arrange the characters in assending order
//Eg.Input string - Everestek
// Output: Lowest frequency characters - v,r,s,t,k
//         Highest frequency characters - eeee

package com.sample.interview.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Program8 {

    public static void main(String[] args) {
        String name = "Everestek";
        char[] ch = name.toLowerCase().toCharArray();
        Arrays.sort(ch);

        ArrayList<Character> highest = new ArrayList<>();
        ArrayList<Character> lowest = new ArrayList<>();


        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    highest.add(ch[i]);
                } else {
                    lowest.add(ch[j]);
                }
            }
        }
        Arrays.sort(lowest.toArray());

        for (char chj : lowest) {
            System.out.print(chj + ",");
        }
        System.out.println();
        for (char chj : highest) {
            System.out.print(chj + ",");
        }
    }
}