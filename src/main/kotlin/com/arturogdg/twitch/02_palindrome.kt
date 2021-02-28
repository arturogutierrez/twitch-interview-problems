package com.arturogdg.twitch

/**
 * Evaluate if the given string is a palindrome or not. Palindrome: phrase, words or
 * a sequence of characters which reads the same backward or forward.
 *
 * Constraints
 *  text != null
 */
class Palindromes {
    fun evaluate(text: String): Boolean {
        if (text.isEmpty()) {
            return false
        }

        val length = text.length
        for (i in 0 until length / 2) {
            if (text[i] != text[length - 1 - i]) {
                return false
            }
        }
        return true
    }
}
