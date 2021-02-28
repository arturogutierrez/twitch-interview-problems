package com.arturogdg.twitch

/**
 * Design a data structure that follows the constraints of a
 * Least Recently Used (LRU) cache.
 *
 * Implement the LRUCache class:
 *   - LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 *   - int get(int key) Return the value of the key if the key exists,
 *     otherwise return -1.
 *   - void put(int key, int value) Update the value of the key if the key exists.
 *     Otherwise, add the key-value pair to the cache.
 *     If the number of keys exceeds the capacity from this operation,
 *     evict the least recently used key.
 *
 * Could you do get and put in O(1) time complexity?
 *
 * Example 1:
 *  LRUCache lRUCache = new LRUCache(2);
 *  lRUCache.put(1, 1); // cache is {1=1}
 *  lRUCache.put(2, 2); // cache is {1=1, 2=2}
 *  lRUCache.get(1);    // return 1
 *  lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 *  lRUCache.get(2);    // returns -1 (not found)
 *  lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 *  lRUCache.get(1);    // return -1 (not found)
 *  lRUCache.get(3);    // return 3
 *  lRUCache.get(4);    // return 4
 */
class LRUCache(private val capacity: Int) {
    private val map = mutableMapOf<Int, DoubleLinkedListNode>()
    private var head: DoubleLinkedListNode? = null
    private var end: DoubleLinkedListNode? = null
    private var length = 0

    fun get(key: Int): Int {
        val node = map[key]
        return if (node == null) {
            -1
        } else {
            removeNode(node)
            setHead(node)
            node.value
        }
    }

    fun put(key: Int, value: Int) {
        val node = map[key]
        if (node == null) {
            val newNode = DoubleLinkedListNode(key, value)
            if (length < capacity) {
                map[key] = newNode
                setHead(newNode)
                length++
            } else {
                end?.let { oldEnd ->
                    map.remove(oldEnd.key)
                    removeNode(oldEnd)
                }
                map[key] = newNode
                setHead(newNode)
            }
        } else {
            node.value = value
            removeNode(node)
            setHead(node)
        }
    }

    private fun setHead(node: DoubleLinkedListNode) {
        node.next = head
        node.previous = null

        head?.previous = node
        head = node

        if (end == null) {
            end = node
        }
    }

    private fun removeNode(node: DoubleLinkedListNode) {
        val pre = node.previous
        val next = node.next

        if (pre != null) {
            pre.next = next
        } else {
            head = next
        }

        if (next != null) {
            next.previous = pre
        } else {
            end = pre
        }
    }
}

internal data class DoubleLinkedListNode(
        var key: Int,
        var value: Int,
        var previous: DoubleLinkedListNode? = null,
        var next: DoubleLinkedListNode? = null,
)

