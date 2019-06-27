package com.albion.util.stack

import org.junit.Assert
import org.junit.Test

class QueueTest {

    @Test
    fun testBasic() {
        var queue = Queue<Int>()
        val n = arrayOf(5,4,3,2,1)
        for(i in n) {
            queue.enqueue(i)
        }
        val expected = 5
        val actual = queue.dequeue()
        Assert.assertEquals(expected, actual)
        Assert.assertEquals(4, queue.size())
    }
}