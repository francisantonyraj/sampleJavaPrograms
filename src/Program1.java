//Write a program to find the missing number from the array.
//Eg.
//input  : 1234678
//output : 5
//input  : 123456
//output : -1

import java.util.Arrays;

public class Program1 {
    public static int checkMissingNumber(int[] arr, int len) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == ++temp) {
                count++;
            } else {
                return ++count;
            }
        }
        if (count == len) ;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8};
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println(checkMissingNumber(arr, len));

    }
}