package ua.tqs;

import java.lang.reflect.Array;

public class IntegerStack implements StackInterface<Integer> {

    private int[] stack;
    private int maxSize = 0;
    private int topElement = -1;

    public IntegerStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    public void push(Integer x) {
        this.stack[++this.topElement] = x;
    }

    public Integer pop() {
        Integer n = this.stack[this.topElement];
        this.stack[this.topElement--] = 0;
        return n;
    }

    public Integer peek() {
        return this.stack[this.topElement];
    }

    public int size() {
        return this.topElement + 1;
    }

    public boolean isEmpty() {
        return this.topElement == -1;
    }

}
