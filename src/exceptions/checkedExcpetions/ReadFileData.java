package exceptions.checkedExcpetions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileData {

    static FileInputStream fileInputStream = null;

    public static void main(String[] args) {
        try {
            fileInputStream = new FileInputStream("/Users/navisalfredjeromefrancisantonyraj/Downloads/file2.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Line number 17");
        int m;
        try {
            while ((m = fileInputStream.read()) != -1) {
                System.out.print((char) m);
            }
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            fileInputStream.close();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Line number 32");
    }
}
