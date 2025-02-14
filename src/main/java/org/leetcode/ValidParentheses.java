package org.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{(){}}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> existing = new HashMap<Character, Character>();
        existing.put(')', '(');
        existing.put(']', '[');
        existing.put('}', '{');
        Stack<Character> newStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (existing.containsValue(c)) {
                newStack.push(c);
            } else if (existing.containsKey(c)) {
                if (newStack.isEmpty() || existing.get(c) != newStack.pop()) {
                    return false;
                }
            }
        }

        return newStack.isEmpty();
    }
}
