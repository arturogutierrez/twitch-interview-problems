package com.arturogdg.twitch

import org.junit.Assert.*
import org.junit.Test

class DuplicateRemoverTest {

    @Test
    fun shouldReturnSameArrayWhenOneValue() {
        val remover = DuplicateRemover()

        val input = arrayOf(1)
        val newLength = remover.execute(input)

        assertEquals(1, newLength)
        assertArrayEquals(arrayOf(1), input)
    }

    @Test
    fun shouldRemoveDuplicated() {
        val remover = DuplicateRemover()

        val input = arrayOf(1, 1, 2)
        val newLength = remover.execute(input)

        assertEquals(2, newLength)
        assertArrayEquals(arrayOf(1, 2, 2), input)
    }

    @Test
    fun shouldRemoveDuplicatedWithoutDuplicateItems() {
        val remover = DuplicateRemover()

        val input = arrayOf(1, 2, 3)
        val newLength = remover.execute(input)

        assertEquals(3, newLength)
        assertArrayEquals(arrayOf(1, 2, 3), input)
    }


    @Test
    fun shouldRemoveDuplicatedFromLongArray() {
        val remover = DuplicateRemover()

        val input = arrayOf(1, 1, 2, 3, 3, 4, 4, 4, 5)
        val newLength = remover.execute(input)

        assertEquals(5, newLength)
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 4, 4, 4, 5), input)
    }
}
