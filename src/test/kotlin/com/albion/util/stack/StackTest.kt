package com.albion.util.stack

import org.junit.Assert
import org.junit.Test

class StackTest {

    @Test
    fun testBasic() {
        var stack = Stack<Int>()
        val n = arrayOf(5,4,3,2,1)
        for(i in n) {
            stack.push(i)
        }
        val expected = 1
        val actual = stack.pop()
        Assert.assertEquals(expected, actual)
        Assert.assertEquals(4, stack.size())
    }
}