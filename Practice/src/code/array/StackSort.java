package code.array;

import java.util.Stack;

public class StackSort {

    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            int temp = input.pop();
            System.out.println("Element taken out: " + temp);
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
            System.out.println("Input: " + input);
            System.out.println("Temporary Stack: " + tempStack);
        }
        return tempStack;
    }

    public static void main(String[] args) {

        Stack<Integer> input = new Stack<Integer>();
        input.add(6);
        input.add(4);
        input.add(5);
        input.add(9);
        input.add(2);
        System.out.println("Input: " + input);
        System.out.println("\nFinal sorted Stack: " + sortStack(input));
    }
}
