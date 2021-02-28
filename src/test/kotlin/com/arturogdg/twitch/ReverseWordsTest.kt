package com.arturogdg.twitch

import org.junit.Assert.assertEquals
import org.junit.Test

class ReverseWordsTest {

    @Test
    fun evaluateCases() {
        val reverseWords = ReverseWords()

        assertEquals(
            "3000 you love I",
            reverseWords.calculate("I love you 3000")
        )
        assertEquals(
            "3000 you love I",
            reverseWords.calculate("   I love you 3000   ")
        )
        assertEquals(
            "Hello",
            reverseWords.calculate("Hello")
        )
    }
}
