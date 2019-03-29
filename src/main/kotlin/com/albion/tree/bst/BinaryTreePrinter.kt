package com.albion.tree.bst

import java.util.*

class BinaryTreePrinter {

    companion object {
        @JvmStatic
        fun <T : Comparable<T>> printNode(root: TreeNode<T>) {
            val maxLevel = maxLevel(root)
            val list = listOf(element = root)
            printNodeInternal(list, 1, maxLevel)
        }

        private fun <T : Comparable<T>> printNodeInternal(nodes: List<TreeNode<T>?>, level: Int, maxLevel: Int) {
            if (nodes.isEmpty() || isAllElementsNull(nodes)) {
                return
            }

            val floor = maxLevel - level
            val edgeLines = Math.pow(2.0, Math.max(floor - 1, 0).toDouble()).toInt()
            val firstSpaces = Math.pow(2.0, floor.toDouble()).toInt() - 1
            val betweenSpaces = Math.pow(2.0, (floor + 1).toDouble()).toInt() - 1

            printWhitespaces(firstSpaces)

            val newNodes = ArrayList<TreeNode<T>?>()
            for (node in nodes) {
                if (node != null) {
                    System.out.print(node.data)
                    newNodes.add(node.left)
                    newNodes.add(node.right)
                } else {
                    newNodes.add(null)
                    newNodes.add(null)
                    print(" ")
                }

                printWhitespaces(betweenSpaces)
            }
            println("")

            for (i in 1..edgeLines) {
                for (j in nodes.indices) {
                    printWhitespaces(firstSpaces - i)
                    if (nodes[j] == null) {
                        printWhitespaces(edgeLines + edgeLines + i + 1)
                        continue
                    }

                    if (nodes[j]?.left != null) {
                        print("/")
                    }
                    else {
                        printWhitespaces(1)
                    }

                    printWhitespaces(i + i - 1)

                    if (nodes[j]?.right != null) {
                        print("\\")
                    }
                    else {
                        printWhitespaces(1)
                    }
                    printWhitespaces(edgeLines + edgeLines - i)
                }

                println("")
            }

            printNodeInternal(newNodes, level + 1, maxLevel)
        }

        private fun printWhitespaces(count: Int) {
            for (i in 0 until count) {
                print(" ")
            }
        }

        private fun <T : Comparable<*>> maxLevel(node: TreeNode<T>?): Int {
            return if (node == null) {
                0
            } else {
                Math.max(maxLevel(node.left), maxLevel(node.right)) + 1
            }

        }

        private fun <T> isAllElementsNull(list: List<T>): Boolean {
            for (x in list) {
                if (x != null) {
                    return false
                }
            }
            return true
        }
    }
}