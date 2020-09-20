package com.challenge.codingchallengebase;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Please code your solution in this class
 */

public class Parentheses {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     * <p>
     * Example 1:
     * <p>
     * Input: "()"
     * Output: true
     * Example 2:
     * <p>
     * Input: "()[]{}"
     * Output: true
     * <p>
     * See test cases for more examples and to verify your solution!
     */

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (!stack.empty() && map.get(stack.peek()) == ch) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
        //throw new UnsupportedOperationException("TODO implement me");
    }

}
