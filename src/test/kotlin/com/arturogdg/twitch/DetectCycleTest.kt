package com.arturogdg.twitch

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DetectCycleTest {

    @Test
    fun shouldNotBeCircular() {
        val list = LinkedListNode(
                value = 0,
                next = LinkedListNode(
                        2,
                        null
                )
        )
        val detectCycle = DetectCycle()

        val result = detectCycle.hasCycle(list)

        assertFalse(result)
    }

    @Test
    fun shouldBeCircular() {
        val list = LinkedListNode(
                value = 0,
                next = LinkedListNode(
                        value = 1,
                        next = LinkedListNode(
                                value = 2,
                                next = null,
                        )
                )
        )
        list.next?.next?.next = list.next
        val detectCycle = DetectCycle()

        val result = detectCycle.hasCycle(list)

        assertTrue(result)
    }

    @Test
    fun shouldBeCircularWhenTwoElements() {
        val list = LinkedListNode(
                value = 0,
                next = LinkedListNode(
                        value = 1,
                        next = null
                )
        )
        list.next?.next = list
        val detectCycle = DetectCycle()

        val result = detectCycle.hasCycle(list)

        assertTrue(result)
    }
}
