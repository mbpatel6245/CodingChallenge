package com.challenge.codingchallengebase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibTest {

    @Test
    public void testCase0() {
        int result = testSolution(0);
        assertEquals(0, result);
    }

    @Test
    public void testCase1() {
        int result = testSolution(1);
        assertEquals(1, result);
    }

    @Test
    public void testCase2() {
        int result = testSolution(2);
        assertEquals(1, result);
    }

    @Test
    public void testCase3() {
        int result = testSolution(3);
        assertEquals(2, result);
    }

    @Test
    public void testCase4() {
        int result = testSolution(4);
        assertEquals(3, result);
    }

    @Test
    public void testCase5() {
        int result = testSolution(5);
        assertEquals(5, result);
    }

    @Test
    public void testCase6() {
        int result = testSolution(6);
        assertEquals(8, result);
    }

    @Test
    public void testCase7() {
        int result = testSolution(10);
        assertEquals(55, result);
    }

    @Test
    public void testCase8() {
        int result = testSolution(20);
        assertEquals(6765, result);
    }

    @Test
    public void testCase9() {
        int result = testSolution(30);
        assertEquals(832040, result);
    }

    private static int testSolution(int n) {
        return Fib.fibonacci(n);
    }
}
