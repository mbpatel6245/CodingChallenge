package com.challenge.codingchallengebase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParenthesesTest {

    @Test
    public void testCase1() {
        boolean result = testSolution("");
        assertEquals(true, result);
    }

    @Test
    public void testCase2() {
        boolean result = testSolution("()");
        assertEquals(true, result);
    }

    @Test
    public void testCase3() {
        boolean result = testSolution("()[]{}");
        assertEquals(true, result);
    }


    @Test
    public void testCase4() {
        boolean result = testSolution("(]");
        assertEquals(false, result);
    }


    @Test
    public void testCase5() {
        boolean result = testSolution("([)]");
        assertEquals(false, result);
    }


    @Test
    public void testCase6() {
        boolean result = testSolution("{[]}");
        assertEquals(true, result);
    }


    @Test
    public void testCase7() {
        boolean result = testSolution("}[]{");
        assertEquals(false, result);
    }


    @Test
    public void testCase8() {
        boolean result = testSolution("(}[))");
        assertEquals(false, result);
    }



    private static boolean testSolution(String s) {
        return Parentheses.isValid(s);
    }
}
