package com.arturogdg.twitch

import org.junit.Assert.assertEquals
import org.junit.Test

class FirstCommonAncestorTest {
    @Test
    fun shouldReturnRoot() {
        val a = BinaryTreeNode(
                value = 1
        )
        val b = BinaryTreeNode(
                value = 2
        )
        val root = BinaryTreeNode(0, a, b)
        val firstCommonAncestor = FirstCommonAncestor()

        val result = firstCommonAncestor.commonAncestor(root, a, b)

        assertEquals(root, result)
    }

    @Test
    fun shouldReturn() {
        //     ROOT
        //   1     2
        //  3 4   5
        //     6
        val a = BinaryTreeNode(6)
        val b = BinaryTreeNode(3)
        val root = BinaryTreeNode(
                value = 0,
                left = BinaryTreeNode(
                        value = 1,
                        left = b,
                        right = BinaryTreeNode(
                                value = 4,
                                right = a
                        ),
                ),
                right = BinaryTreeNode(
                        value = 2,
                        left = BinaryTreeNode(5)
                ),
        )
        val firstCommonAncestor = FirstCommonAncestor()

        val result = firstCommonAncestor.commonAncestor(root, a, b)

        assertEquals(1, result!!.value)
    }
}
