package com.fpolizzi;

import java.util.Stack;

/**
 * Created by fpolizzi on 8/11/26
 */
public class ValidParentheses {

    void main() {

        String testString = "()[]{}";

        System.out.println(isValid(testString));
    }

    public boolean isValid(String s) {

        Stack<Character> stack  = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');

            else if (stack.isEmpty() || stack.pop() != c)
                return false;

        }

        return stack.isEmpty();
    }
}
