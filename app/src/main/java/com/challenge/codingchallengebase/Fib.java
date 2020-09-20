package com.challenge.codingchallengebase;

/**
 * Please code your solution in this class.
 */
public class Fib {

    /**
     * TODO -- Instructions
     * Given an integer, return the nth element in the Fibonacci Sequence.
     * The Fibonacci Sequence begins with 0 and 1 as its first and second elements.
     * Each subsequent element is equal to the sum of the previous two elements.
     * ----------------------------
     * Constraints: n >= 0 && n <= 30
     * ----------------------------
     * Do not change method name / signature in any way
     * ----------------------------
     * ==Example==
     * Input: 5
     * Output: 5
     * Explanation: The value in the sequence at n = 5 is 5
     * [0, 1, 1, 2, 3, 5, 8]
     * ---------------^
     * See test cases for more examples and to verify your solution!
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n >= 0 && n <= 30) {

            int[] flag = new int[n+1];
            for (int i = 0; i <= n; i++) {
                if (i < 2)
                    flag[i] = i;
                else
                    flag[i] = flag[i - 1] + flag[i - 2];
            }
            return flag[n ];
        }
        throw new UnsupportedOperationException("TODO implement me");
    }
}
