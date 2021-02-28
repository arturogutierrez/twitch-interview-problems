package com.arturogdg.twitch

import org.junit.Assert.*
import org.junit.Test

class PalindromesTest {
    @Test
    fun shouldReturnFalseWhenEmpty() {
        val palindrome = Palindromes()

        val result = palindrome.evaluate("")

        assertFalse(result)
    }

    @Test
    fun shouldReturnTrueWhenPalindrome() {
        val palindrome = Palindromes()

        val result = palindrome.evaluate("anna")

        assertTrue(result)
    }

    @Test
    fun shouldReturnTrueWhenPalindromeWithOddCharacters() {
        val palindrome = Palindromes()

        val result = palindrome.evaluate("121")

        assertTrue(result)
    }

    @Test
    fun shouldReturnFalseWhenNoPalindrome() {
        val palindrome = Palindromes()

        val result = palindrome.evaluate("arturogdg")

        assertFalse(result)
    }
}
