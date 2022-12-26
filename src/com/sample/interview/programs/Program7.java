//Swap the numbers
package com.sample.interview.programs;

public class Program7 {

    public static void main(String[] args) {
        int num = 321;
        int temp = 0;
        while (num > 0) {
            temp = (num % 10) + temp * 10;
            num = num / 10;
        }
        System.out.println(temp);
    }
}
