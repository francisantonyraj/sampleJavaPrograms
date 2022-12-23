//Difference between static blocks, instance blocks and constructor
package recursion;

public class BlocksJava {

    BlocksJava(){
        System.out.println("Constructor block");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        new BlocksJava();
        {
            System.out.println("Instance block");
        }
    }
}
