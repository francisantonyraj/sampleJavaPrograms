package collections;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("E1");
        stack.add("E2");
        stack.add("E3");
        stack.add("E4");
        stack.add("E5");
        stack.add("E6");

        stack.pop(); //remove data LIFO
        stack.push("E7"); // add data
//        boolean value = stack.contains("E6");

        System.out.println(stack.contains("E7"));
        System.out.println(stack.peek());

    }
}
