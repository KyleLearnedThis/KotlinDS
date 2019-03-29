package com.albion.tree.bst

import org.junit.Assert

class BinarySearchTreeTest {

    @org.junit.Test
    fun testBSTBasic() {
        val input = arrayListOf(15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9)
        val bst =  BinarySearchTree<Int>()
        for (i in input) {
            bst.insert(i)
        }
        val root = bst.root!!
        BinaryTreePrinter.printNode(root)

        bst.printInOrder()
        val expected = 7
        val node = bst.find(expected)
        Assert.assertNotNull("Can't find the node", node)
        Assert.assertEquals(node?.data!!, expected)
    }
}