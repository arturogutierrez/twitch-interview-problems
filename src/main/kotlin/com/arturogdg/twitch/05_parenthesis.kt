package com.arturogdg.twitch

import java.util.Stack

/**
 * Given a string containing just the characters (, ), {, }, [ and ],
 * determine if the parenthesis are balanced.
 * The brackets must close in the correct order, "()" and "()[]{}"
 * are all valid but "(]" and "([)]" are not.
 */
class Parentheses {

    fun evaluate(input: String): Boolean {
        if (input.isEmpty()) {
            return true
        }

        val chars = mapOf(
                ')' to '(',
                '}' to '{',
                ']' to '['
        )

        val stack = Stack<Char>()
        input.forEach { c ->
            // closing?
            if (chars.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false
                }

                // Get the most recent opening element
                val peek = stack.peek()
                val opening = chars[c]
                if (peek != opening) {
                    return false
                }
                stack.pop()
            } else {
                stack.push(c)
            }
        }

        return stack.isEmpty()
    }

}
