package com.arturogdg.twitch

/**
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be
 * separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words.
 * Do not include any extra spaces.
 *
 * Example 1:
 *  Input: s = "the sky is blue"
 *  Output: "blue is sky the"
 *
 * Example 2:
 *  Input: s = "  hello world  "
 *  Output: "world hello"
 */
class ReverseWords {

    fun calculate(input: String): String {
        if (input.isEmpty()) {
            return ""
        }

        val words = input.split(' ')
        val length = words.size
        val result = mutableListOf<String>()
        for (i in (length - 1) downTo 0) {
            val word = words[i]
            if (word.isNotEmpty()) {
                result.add(word)
            }
        }
        return result.joinToString(separator = " ")
    }
}
