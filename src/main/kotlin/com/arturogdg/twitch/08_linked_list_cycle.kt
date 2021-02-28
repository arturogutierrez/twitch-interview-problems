package com.arturogdg.twitch

/**
 * Detect if there is a cycle in a linked list
 *
 */

class DetectCycle {

    fun hasCycle(head: LinkedListNode): Boolean {
        if (head.next == null) {
            return false
        }

        var slow: LinkedListNode? = head
        var fast: LinkedListNode? = head.next
        while (fast != null) {
            if (slow == fast) {
                return true
            }

            slow = slow?.next
            fast = fast.next?.next
        }

        return false
    }
}

data class LinkedListNode(val value: Int, var next: LinkedListNode?)
