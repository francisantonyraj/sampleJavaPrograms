package exceptions.uncheckedException.arrayIndexException;

import java.io.FileInputStream;

public class MainClass {

    public static void main(String[] args) {
        int[] num = new int[3]; //0 1 2
        try {
            num[0] = 10;
            num[1] = 20;
            num[2] = 30;
            num[3] = 40; //3
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(num[1]);
    }
}
