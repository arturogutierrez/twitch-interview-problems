package com.arturogdg.twitch

/**
 * Given a sorted array, remove the duplicates in place such that each element appear
 * only once and return the new length. Do not allocate extra space for another array,
 * you must do this in place with constant memory.
 *
 * For example:
 *   - Given input array A = [1,1,2]
 *   - Your function should return length = 2, and A is now [1,2,2].
 *
 *  Constraints:
 *    0 <= input's size
 *
 *  ex: O(N)
 *  mem: O(1)
 */
class DuplicateRemover {
    fun execute(input: Array<Int>): Int {
        val length = input.size
        if (length < 2) {
            return length
        }

        // length >= 2
        var i = 0
        var next = 1
        while (next < length) {
            if (input[i] == input[next]) {
                next++
            } else {
                i++
                input[i] = input[next]
                next++
            }
        }

        return i + 1
    }
}
