//today is thursday
package recursion;

public class Program2 {
    public static void main(String[] args) {
        String strData = "today is thursday";
        int i=0;
        String data1 = strData.substring(0, 5);
        String data2 = strData.substring(6, 8);
        String data3 = strData.substring(9, 17);
        StringBuilder stringBuilder = new StringBuilder(data3 + " " + data2 + " " + data1);

        System.out.println(stringBuilder.reverse());
    }
}