//String [] state ={"Delhi","Kolkatta","mumbai","chennai"}
//print the non-duplicate fields

package com.sample.interview.programs;

import java.util.Arrays;

public class Program6 {

    public static void main(String[] args) {
        String[] states = {"Delhi", "Kolkatta", "mumbai", "chennai"};

        state(states);
    }

    private static void state(String[] states) {
        int len = states.length;
        for (int i = 0; i < len; i++) {
            String state = states[i].toLowerCase();
            char [] ch = state.toCharArray();
        }
    }
}
