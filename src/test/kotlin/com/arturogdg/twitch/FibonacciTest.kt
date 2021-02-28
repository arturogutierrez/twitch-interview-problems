package com.arturogdg.twitch

import org.junit.Assert.*
import org.junit.Test

class FibonacciTest {
    @Test
    fun firstNumberShouldBeZero() {
        val fibonacci = Fibonacci()

        val result = fibonacci.calculate(0)

        assertEquals(0, result)
    }

    @Test
    fun fourthNumberShouldBeThree() {
        val fibonacci = Fibonacci()

        val result = fibonacci.calculate(4)

        assertEquals(3, result)
    }

    @Test
    fun eightNumberShouldBeThree() {
        val fibonacci = Fibonacci()

        val result = fibonacci.calculate(8)

        assertEquals(21, result)
    }
}
