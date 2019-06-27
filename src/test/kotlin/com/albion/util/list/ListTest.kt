package com.albion.util.list

import org.junit.Assert
import org.junit.Test

class ListTest {

    @Test
    fun testAppend() {
        val input = arrayOf(5, 4, 3, 2, 1)
        val list = List(input)
        println("===== printList =====")
        list.printList()
        println("===== printListReverse =====")
        list.printListReverse()
    }

    @Test
    fun testSize() {
        val input = arrayOf(5, 4, 3, 2, 1)
        val list = List(input)
        val actual = list.size()
        val expected = 5
        Assert.assertEquals(actual,expected)
    }
}