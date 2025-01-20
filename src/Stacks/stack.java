package Stacks;

import java.util.Queue;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(3);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
