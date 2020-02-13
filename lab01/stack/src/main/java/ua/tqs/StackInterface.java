package ua.tqs;

public interface StackInterface<T> {

    // abstract methods of a stack
    void push(T x);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
