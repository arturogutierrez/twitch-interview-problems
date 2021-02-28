package com.arturogdg.twitch

/**
 * Find the first common ancestor of two nodes in a binary tree.
 * NOTE: This is not necessarily a binary search tree.
 *
 */
class FirstCommonAncestor {
    fun commonAncestor(root: BinaryTreeNode, p: BinaryTreeNode, q: BinaryTreeNode): BinaryTreeNode? {
        if (!isChild(root, p) || !isChild(root, q)) {
            return null
        }

        return searchAncestor(root, p, q)
    }

    private fun isChild(node: BinaryTreeNode?, child: BinaryTreeNode): Boolean {
        if (node == null) return false
        if (node == child) return true
        return isChild(node.left, child) || isChild(node.right, child)
    }

    private fun searchAncestor(root: BinaryTreeNode?, p: BinaryTreeNode, q: BinaryTreeNode): BinaryTreeNode? {
        if (root == null) {
            return root
        }

        val pOnLeft = isChild(root.left, p)
        val qOnLeft = isChild(root.left, q)
        if (pOnLeft != qOnLeft) {
            return root
        }

        return if (pOnLeft) {
            searchAncestor(root.left, p, q)
        } else {
            searchAncestor(root.right, p, q)
        }
    }
}

data class BinaryTreeNode(
        val value: Int,
        val left: BinaryTreeNode? = null,
        val right: BinaryTreeNode? = null,
)
