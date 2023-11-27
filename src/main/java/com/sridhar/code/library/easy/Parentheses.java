package com.sridhar.code.library.easy;

import java.util.*;

/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

 */
public class Parentheses {

    public boolean isValid(String s) {
        Map<Character, Character> map = Map.ofEntries(Map.entry(')', '('), Map.entry('}', '{'), Map.entry(']', '['));
        Stack<Character> stack = new Stack<>();
        List<Character> openingBraces = List.of('(', '{', '[');
        List<Character> closingBraces = List.of('}', ')', ']');
        for(Character i: s.toCharArray()) {

            if(openingBraces.contains(i)) {
                stack.push(i);
            } else if(stack.isEmpty()) {
                return false;
            } else {
                if(stack.peek().equals(map.get(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
