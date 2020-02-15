package ua.tqs;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class IntegerStack implements StackInterface<Integer> {

    private int[] stack;
    private int maxSize = 0;
    private int topElement = -1;

    public IntegerStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    public void push(Integer x) {
        if(this.isFull())
            throw new IllegalStateException();
        this.stack[++this.topElement] = x;
    }

    public Integer pop() {

        if(this.isEmpty())
            throw new NoSuchElementException();

        Integer n = this.stack[this.topElement];
        this.stack[this.topElement--] = 0;
        return n;
    }

    public Integer peek() {
        if(this.isEmpty())
            throw new NoSuchElementException();
        return this.stack[this.topElement];
    }

    public int size() {
        return this.topElement + 1;
    }

    public boolean isEmpty() {
        return this.topElement == -1;
    }

    public boolean isFull() {
        return this.topElement == this.maxSize - 1;
    }

}
