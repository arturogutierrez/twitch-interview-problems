package com.arturogdg.twitch

import org.junit.Assert.*
import org.junit.Test

class ParenthesesTest {
    @Test
    fun testAllCases() {
        val parentheses = Parentheses()

        assertTrue(parentheses.evaluate("()"))
        assertTrue(parentheses.evaluate("([])"))
        assertFalse(parentheses.evaluate("([)"))
        assertFalse(parentheses.evaluate("()["))
    }
}
