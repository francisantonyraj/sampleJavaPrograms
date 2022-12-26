package exceptions.uncheckedException.mutipleCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/navisalfredjeromefrancisantonyraj/Downloads/file1.txt");
            fileInputStream.read();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
