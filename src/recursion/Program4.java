//Armstrong number 371
package recursion;

public class Program4 {

    public static void main(String[] args) {
        int num = 372;
        int temp = 0;
        int sum = 0;
        int num2=num;
        while (num > 0) {
            temp = num % 10;
            sum = (temp * temp * temp) + sum;
            num = num / 10;
        }
        if(sum==num2){
            System.out.println("Arm Strong number");
        }else{
            System.out.println("Not an arm strong number");
        }
    }
}
