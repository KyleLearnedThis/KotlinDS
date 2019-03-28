package com.albion.tree.bst

class BinarySearchTreeTest {

    @org.junit.Test
    fun testBSTBasic() {
        val input = arrayListOf(15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9)
        var bst =  BinarySearchTree<Int>()
        for (i in input) {
            bst.insert(i)
        }

        bst.printInOrder()
    }
}