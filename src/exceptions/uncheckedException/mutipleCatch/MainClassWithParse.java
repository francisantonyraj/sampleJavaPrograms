package exceptions.uncheckedException.mutipleCatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainClassWithParse {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException ex) {
            System.out.println("File Not found Exception");
        }
    }
}
