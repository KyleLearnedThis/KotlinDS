package com.albion.tree.bst

class BinarySearchTree<T: Comparable<T>> {
    var root: TreeNode<T>? = null

    fun insert(d: T) {
        if(root == null) {
            root = TreeNode(d)
        } else {
            insertWork(root, d)
        }
    }

    private fun insertWork(node: TreeNode<T>?, data: T) {
        val curVal = node?.data!!
        val compare = data.compareTo(curVal)

        if(compare == 0) {
            return
        } else if(compare == -1) {
            if(node.left == null) {
                node.left = TreeNode(data, node)
            } else {
                insertWork(node.left, data)
            }
        } else {
            if(node.right == null) {
                node.right = TreeNode(data, node)
            } else {
                insertWork(node.right, data)
            }
        }
    }

    fun find(seek: T): TreeNode<T>? {
        var cur = this.root
        while(cur != null) {
            val compare = seek.compareTo(cur.data)
            cur = when (compare) {
                0 -> return cur
                1 -> cur.right
                else -> cur.left
            }
        }
        return cur
    }

    fun printInOrder() {
       printInOrderWork(root)
    }

    private fun printInOrderWork(node: TreeNode<T>?) {
        if(node == null) {
            return
        }
        printInOrderWork(node.left)
        print("[${node.data}] ")
        printInOrderWork(node.right)

    }
}
