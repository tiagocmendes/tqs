package ua.tqs;

public class Main {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(10);

        stack.push(323);
        stack.push(123);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
