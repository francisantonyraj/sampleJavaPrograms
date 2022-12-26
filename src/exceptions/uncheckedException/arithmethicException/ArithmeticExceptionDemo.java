package exceptions.uncheckedException.arithmethicException;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        int num = 10;
        int value = 0;
        try {
            value = num / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
//        value = num / 0;
        System.out.println(value);

        value = num + 10;
        System.out.println(value);

//        int num = 10;
//        int div = 0;
//        int value = 0;
////        value = num / div; //process ends
//        try {
//            value = num / div; //process ends
//            System.out.println("Print line one");
//        } catch (ArithmeticException ex) {
//            System.out.println("Please check the divisible value");
//        }
//        System.out.println(value);
//        System.out.println("Print line two");
//
    }
}
