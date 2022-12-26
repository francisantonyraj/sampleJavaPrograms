//You have print numbers 1 - 100 and the number divisible by 3 should be print as foo and number divisible by 5 should be print as bar
//number divisible by both 3&5 then it should be foobar
package com.sample.interview.programs;

public class Program10 {

    public static void main(String[] args) {

        int numberDivisibleByThree = 3;
        int numberDivisibleByFive = 5;

        for (int i = 1; i <= 100; i++) {
            if (i % numberDivisibleByThree == 0 && i % numberDivisibleByFive == 0) {
                System.out.println("fooBar");
            } else if (i % numberDivisibleByFive == 0) {
                System.out.println("Bar");
            } else if(i % numberDivisibleByThree == 0){
                System.out.println("foo");
            }else{
                System.out.println(i);
            }
        }
    }
}
