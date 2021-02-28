package com.arturogdg.twitch

/**
 * Calculate the Nth number of a Fibonacci sequence:
 *
 * 0,1,1,2,3,5,8,13,21,34...
 *
 * Constraints:
 *   0 <= n <= 30
 *
 *   ex: O(N)
 *   mem: O(1)
 */
class Fibonacci {

    fun calculate(n: Int): Int {
        if (n <= 0) {
            return 0
        }

        var previous = 0
        var current = 1
        for (i in 2..n) {
            val sum = previous + current
            previous = current
            current = sum
        }
        return current

        // Sequence
//        val sequence = sequence<Int> {
//            var numbers = Pair(0, 1)
//            while(true) {
//                yield(numbers.first)
//                numbers = Pair(numbers.second, numbers.first + numbers.second);
//            }
//        }
//        return sequence.elementAt(n);

        // Fold
//        return (2 until n).fold(1 to 1) { (prev, next), _ -> next to (prev + next) }.second
    }
}
