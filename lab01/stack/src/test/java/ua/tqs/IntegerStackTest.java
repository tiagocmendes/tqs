package ua.tqs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IntegerStackTest {

    private int MAX_SIZE = 10;
    private IntegerStack stack = new IntegerStack(MAX_SIZE);

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Test
    void push() {
        System.out.println("----------PUSH TEST----------");
        int element = 30;
        this.stack.push(element);
        assertEquals((Integer) element, stack.peek());
    }

    @Test
    void stackEmptyOnConstruction() {
        System.out.println("----------STACK EMPTY ON CONSTRUCTION TEST----------");
        IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        assertEquals(true, localStack.isEmpty());
    }

    @Test
    void sizeZeroOnConstruction() {
        System.out.println("----------SIZE ZERO ON CONSTRUCTION TEST----------");
        IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        assertEquals(0, localStack.size());
    }

    @Test
    void severalPushes() {
        System.out.println("----------SEVERAL PUSHES TEST----------");
        IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        int n = 10; // 10 pushes
        for(int i = 0; i < n; i++)
            localStack.push(i);
        assertEquals(false, localStack.isEmpty());
        assertEquals(n, localStack.size());
    }

    @Test
    void pushThenPop() {
        System.out.println("----------PUSH THEN POP TEST----------");
        IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        int x = 243;    // value to push
        localStack.push(x);
        assertEquals((Integer)x, localStack.pop());
    }

    @Test
    void pushThenPeek() {
        System.out.println("----------PUSH THEN PEEK TEST----------");
        IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        int x = 243;    // value to push
        localStack.push(x);
        int oldSize = localStack.size();
        assertEquals((Integer)x, localStack.peek());
        assertEquals(oldSize, localStack.size());
    }

    @Test
    void severalPops() {
        System.out.println("----------SEVERAL POPS TEST----------");
        IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        int n = 10; // 10 pushes

        // several pushes
        for(int i = 0; i < n; i++)
            localStack.push(i);
        assertEquals(false, localStack.isEmpty());
        assertEquals(n, localStack.size());

        // several pops
        for(int i = 0; i < n; i++)
            localStack.pop();
        assertEquals(true, localStack.isEmpty());
        assertEquals(0, localStack.size());
    }

    @Test
    void popFromEmptyStack() {
        System.out.println("----------POP FROM EMPTY STACK TEST----------");
        final IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        assertThrows(NoSuchElementException.class, new Executable() {
            public void execute() throws Throwable {
                localStack.pop();
            }
        });
    }

    @Test
    void peekFromEmptyStack() {
        System.out.println("----------PEEK FROM EMPTY STACK TEST----------");
        final IntegerStack localStack = new IntegerStack(this.MAX_SIZE);
        assertThrows(NoSuchElementException.class, new Executable() {
            public void execute() throws Throwable {
                localStack.peek();
            }
        });
    }

    @Test
    void pushToFullStack() {
        System.out.println("----------PUSH TO FULL STACK TEST----------");
        final IntegerStack localStack = new IntegerStack(1);
        localStack.push(123);
        assertThrows(IllegalStateException.class, new Executable() {
            public void execute() throws Throwable {
                localStack.push(69);
            }
        });
    }

}