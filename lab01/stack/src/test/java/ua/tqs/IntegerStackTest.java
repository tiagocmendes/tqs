package ua.tqs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        IntegerStack stack = new IntegerStack(1);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
    }


    @Test
    void pop() {
    }

    /*
    @Test
    void peek() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }
    */
}