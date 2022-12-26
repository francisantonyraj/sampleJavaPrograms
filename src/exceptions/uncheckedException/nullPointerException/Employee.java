package exceptions.uncheckedException.nullPointerException;

public class Employee {

    public static void show() {
        display(null);
    }

    public static void display(String value) {
        try {
            System.out.println(value.toUpperCase());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("After the exception");

    }
}
